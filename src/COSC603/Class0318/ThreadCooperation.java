package COSC603.Class0318;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation
{
    private static Account account = new Account();

    public static void main(String[] args)
    {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new DepositTask());
        es.execute(new WithdrawTask());

        es.shutdown();



        System.out.println("Thread 1\t\tThread 2\t\tBalance");
    }

    public static class DepositTask implements Runnable
    {
        @Override
        public void run()
        {
            try//purposely delay it to let the withdraw method proceed
            {
                while (true)
                {
                    account.deposit((int)(Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
    public static class WithdrawTask implements Runnable
    {
        @Override
        public void run()
        {
            while (true)
            {
                account.withdraw((int)(Math.random() * 10) + 1);
            }
        }
    }
    private static class Account
    {
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition();
        private int balance = 0;
        public int getBalance(){
            return balance;
        }
        public void withdraw(int amount)
        {
            lock.lock();
            try
            {
                while (balance < amount)
                {
                    System.out.println("\t\t\tWait for deposit");
                    newDeposit.await();
                }
                balance -= amount;
                System.out.println("\t\t\tWithdraw " + amount + "\t\t" + getBalance());
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }finally
            {
                lock.unlock();
            }
        }

        public void deposit(int amount)
        {
            lock.lock();
            try
            {
                balance += amount;
                System.out.println("Deposit " + amount + "\t\t\t\t\t" + getBalance());

                newDeposit.signalAll();
            } finally
            {
                lock.unlock();
            }
        }
    }

}
