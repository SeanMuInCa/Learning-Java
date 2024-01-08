package COSC602.Class0105;

import java.util.Arrays;

public class RecursiveSelectionSort
{
    public static void main(String[] args)
    {
        double[] arr = new double[]{24,5,6,22,42,2,1};
        RecursiveSelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(double[] arr){
        sort(arr,0,arr.length - 1);
    }

    private static void sort(double[] arr, int left, int right)
    {
        if (left < right){
            int indexOfLow = left;
            double min = arr[left];
            for (int i = left + 1; i <= right; i++)
            {
                if(arr[i] < min){
                    min = arr[i];
                    indexOfLow = i;
                }
            }
            arr[indexOfLow] = arr[left];
            arr[left] = min;

            sort(arr,left + 1, right);
        }
    }
}
