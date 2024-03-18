package COSC603.Class0318;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithSyncUsingLock
{
    private static Account account = new Account();

    public static void main(String[] args)
    {
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++)
        {
            es.execute(new AddAPennyTask());
        }

        es.shutdown();

        while (!es.isTerminated())
        {

        }

        System.out.println(account.getBalance());
    }

    private static class AddAPennyTask implements Runnable
    {

        Lock lock = new ReentrantLock();
        @Override
        public void run()
        {
            /*synchronized (account)
            {
                account.deposit(1);
            }*/
            account.deposit(1);
        }
    }

    private static class Account
    {
        private static final Lock lock = new ReentrantLock();
        private double balance = 0;

        public double getBalance()
        {
            return balance;
        }

        public void deposit(double amount)
        // public void deposit(double amount)
        {
            lock.lock();
            double newBalance = balance + amount;

            //this delay is deliberately added to magnify
            //the data-corruption problem and make it easy to see.
            try
            {
                Thread.sleep(1);
                balance = newBalance;
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }finally
            {
                lock.unlock();
            }
        }
    }
}
