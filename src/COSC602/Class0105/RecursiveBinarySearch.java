package COSC602.Class0105;

public class RecursiveBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr, 3));
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        return binarySearch(arr, key, low, high);
    }

    private static int binarySearch(int[] arr, int key, int low, int high)
    {
        if(low > high) return -low - 1;
        int mid = (low + high) / 2;
        if(key < arr[mid])
            return binarySearch(arr, key, low, mid - 1);
        else if (key == arr[mid])
            return mid;
        else return binarySearch(arr, key, mid + 1, high);
    }
}
