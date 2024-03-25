package COSC603.Class0325;

import COSC603.Class0318.AccountWithSync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AddSum
{
    public static void main(String[] args)
    {
        Integer sum = 0;
        ExecutorService es = Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++)
        {
            sum += getSum(sum);
        }
        System.out.println(sum);
        es.shutdown();

        while (!es.isTerminated())
        {

        }

    }

    private static int getSum(Integer sum)
    {
        RecursiveTask<Integer> task = new Add(sum);
        try (
                ForkJoinPool pool = new ForkJoinPool();
        )
        {
            return pool.invoke(task);
        }
    }

    private static class Add extends RecursiveTask<Integer>
    {
       Integer sum;

        public Add(Integer sum)
        {
            this.sum = sum;
        }

        @Override
        protected Integer compute()
        {
            sum += 1;
            return sum;
        }
    }
}
