package COSC603.Class0325;

public class MergeSort
{
    /**
     * original merge sort
     */
    public static void mergeSort(int[] list)
    {
        if(list.length > 1)
        {
            //first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            //second half
            int secondLength = list.length - firstHalf.length;
            int[] secondHalf = new int[secondLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] firstHalf, int[] secondHalf, int[] list)
    {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < firstHalf.length && current2 < secondHalf.length)
        {
            if(firstHalf[current1] < secondHalf[current2])
            {
                list[current3++] = firstHalf[current1++];
            }else
            {
                list[current3++] = secondHalf[current2++];
            }
        }

        while (current1 < firstHalf.length)
        {
            list[current3++] = firstHalf[current1++];
        }
        while (current2 < secondHalf.length)
        {
            list[current3++] = secondHalf[current2++];
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {4,2,1,5,6,7,2,1,24,51,151,13,5,9};
        mergeSort(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
