public class Sorter
{
    public static void recSelectionSort(int[] arr)
    {
        recSelectionSort(arr, arr.length - 1);
    }

    private static void recSelectionSort(int[] arr, int right)
    {
        //base case
        if (right < 1) return;

        int highPos = 0;
        for (int i = 1; i <= right; i++)
        {
            if (arr[i] > arr[highPos])
            {
                highPos = i;
            }
        }

        swap(arr, highPos, right);
        recSelectionSort(arr, right - 1);
    }

    public static void mergeSort(int[] arr)
    {
        //base case
        if(arr.length <= 1) return;

        int mid = arr.length / 2;

        int[] leftPart = new int[mid];
        int[] rightPart = new int[arr.length - mid];

        System.arraycopy(arr,0,leftPart,0,mid);
        System.arraycopy(arr,mid,rightPart,0,arr.length - mid);

        mergeSort(leftPart);
        mergeSort(rightPart);

        merge(arr, leftPart, rightPart);
    }

    public static void merge(int[] arr, int[] leftPart, int[] rightPart)
    {
        for (int i = 0, j = 0,k=0; (i < leftPart.length && j < rightPart.length); )
        {
            if(leftPart[i] < rightPart[j]){
                arr[k] = leftPart[i];
                i++;
            }else {
                arr[k] = rightPart[j];
                j++;
            }
            k++;
        }
    }

    public static void mergeE(int []arr, int low, int mid, int high)
    {
        int wLen = mid-low+1;
        int hLen = high-mid;
        int []left = new int[wLen];
        int []right;
        if (hLen > 0)
            right= new int[hLen];
        else
            right=null;

        for(int i=0; i<wLen; i++)
        {
            left[i] = arr[low+i]; //Copy left array
        }

        for(int j=0; j<hLen; j++)
        {
            right[j] = arr[mid+1+j]; //Copy right array
        }

        int i=0, j=0, k=low;

        //Merge left and right arrays
        while(i<wLen && j<hLen)
        {
            if(left[i]<=right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while(i<wLen) {
            arr[k++] = left[i++];
        }

        while(j<hLen)
        {
            arr[k++] = right[j++];
        }
    }
    public static void bubbleSort(int[] arr)
    {
        for (int i = arr.length - 1; i > 0; i--)
        {
            boolean sorted = true;
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    swap(arr, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

    private static void swap(int[] arr, int highPos, int right)
    {
        int temp = arr[highPos];
        arr[highPos] = arr[right];
        arr[right] = temp;
    }
    public static void insertionSort(int[] naVals)
    {
        //Outer Loop to walk through teach of the positions

        for (int i=1; i<naVals.length; i++)
        {
            int nCurVal = naVals[i];

            int k;
            for (k = i-1; k>= 0 && naVals[k] > nCurVal; k--)
            {
                naVals[k+1] = naVals[k];
            }

            //insert the current element into the correct position (this may occur twice
            naVals[k+1] = nCurVal;
        }

    }
}
