package COSC603.Class0325;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelMax
{
    public static void main(String[] args)
    {
        final int N = 90000000;
        int[] list = new int[N];

        for (int i = 0; i < N; i++)
        {
            list[i] = (int)(Math.random() * Integer.MAX_VALUE);
        }


        long startTime = System.currentTimeMillis();
        System.out.println("The maximal number is: " + getMax(list));
        long endTime = System.currentTimeMillis();
        System.out.println("It takes " + Runtime.getRuntime().availableProcessors() +
                " processors involved, and it takes " +
                (endTime - startTime) + " million seconds!");
    }

    private static int getMax(int[] list)
    {

        RecursiveTask<Integer> task = new MaxTask(list, 0, list.length);
        try (
                ForkJoinPool pool = new ForkJoinPool();
        )
        {
            return pool.invoke(task);
        }
    }

    private static class MaxTask extends RecursiveTask<Integer>
    {
        private final static int THRESHOLD = 100000;
        private final int[] list;
        private final int low;
        private final int high;

        public MaxTask(int[] list, int low, int high)
        {
            this.high = high;
            this.low = low;
            this.list = list;
        }

        @Override
        protected Integer compute()
        {
            if (high - low < THRESHOLD)
            {
                System.out.println("non-parallel");
                int max = list[low];
                for (int i = low; i < high; i++)
                {
                    if (list[i] > max)
                    {
                        max = list[i];
                    }
                }
                return max;
            } else
            {
                int mid = (low + high) / 2;
                RecursiveTask<Integer> left = new MaxTask(list, low, mid);
                RecursiveTask<Integer> right = new MaxTask(list, mid, high);

                right.fork();
                left.fork();
                return Math.max(left.join(), right.join());
            }
        }
    }
}
