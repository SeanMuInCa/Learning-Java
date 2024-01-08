public class Sorter
{
    public static void recSelectionSort(int[] arr){
        recSelectionSort(arr, arr.length - 1);
    }

    private static void recSelectionSort(int[] arr, int right)
    {
        //base case
        if(right < 1) return;

        int highPos = 0;
        for (int i = 1; i <= right; i++)
        {
            if(arr[i] > arr[highPos]){
                highPos = i;
            }
        }

        swap(arr, highPos, right);
        recSelectionSort(arr, right - 1);
    }

    private static void swap(int[] arr, int highPos, int right)
    {
        int temp = arr[highPos];
        arr[highPos] = arr[right];
        arr[right] = temp;
    }
}
