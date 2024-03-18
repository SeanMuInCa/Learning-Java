package COSC603.Class0318;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync
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

        @Override
        public void run()
        {
            account.deposit(1);
        }
    }
    private static class Account
    {
        private double balance = 0;
        public double getBalance()
        {
            return balance;
        }
        public void deposit(double amount)
        {
            double newBalance = balance + amount;

            //this delay is deliberately added to magnify
            //the data-corruption problem and make it easy to see.
            try
            {
                Thread.sleep(1);
            }catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            balance = newBalance;
        }
    }
}
