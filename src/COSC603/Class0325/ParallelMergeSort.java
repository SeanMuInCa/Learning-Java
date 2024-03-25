package COSC603.Class0325;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelMergeSort
{
    public static void main(String[] args)
    {
        final int SIZE = 8000000;
        int[] list1 = new int[SIZE];
        int[] list2 = new int[SIZE];

        for (int i = 0; i < SIZE; i++)
        {
            list1[i] = list2[i] = (int)(Math.random() * 10000000);
        }

        long startTime = System.currentTimeMillis();
        MergeSort.mergeSort(list1);
        long endTime = System.currentTimeMillis();
        System.out.println("Normal merge sort: It takes " + (endTime - startTime) + " million seconds!");

        startTime = System.currentTimeMillis();
        parallelMergeSort(list2);
        endTime = System.currentTimeMillis();
        System.out.println("Parallel merge sort: It takes " + Runtime.getRuntime().availableProcessors() +
                " processors to sort, and it takes " +
                (endTime - startTime) + " million seconds!");
    }

    private static void parallelMergeSort(int[] list)
    {
        RecursiveAction mainTask = new SortTask(list);

        try(
                ForkJoinPool pool = new ForkJoinPool();
                )
        {

            pool.invoke(mainTask);
        }

    }

    private static class SortTask extends RecursiveAction
    {
        private final int THRESHOLD = 500;
        private final int[] list;

        public SortTask(int[] list)
        {
            this.list = list;
        }

        @Override
        protected void compute()
        {

            if(list.length < THRESHOLD)
            {
                Arrays.sort(list);
            }else
            {
                //first half
                int[] firstHalf = new int[list.length / 2];
                System.arraycopy(list, 0, firstHalf, 0, list.length / 2);


                //second half
                int secondLength = list.length - firstHalf.length;
                int[] secondHalf = new int[secondLength];
                System.arraycopy(list, list.length / 2, secondHalf, 0, secondLength);

                //recursively sort the two halves
                invokeAll(new SortTask(firstHalf), new SortTask(secondHalf));

                //merge
                MergeSort.merge(firstHalf,secondHalf, list);
            }
        }
    }
}
