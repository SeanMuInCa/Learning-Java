package COSC602.Class0103;



import org.junit.Test;

/**
 * Purpose:             TestRecursive<br />
 * Data Submitted:      2024/1/3 <br />
 * Assignment Number:    TestRecursive<br />
 * Course Name:         COSC601  <br />
 * Instructor:          George Ding  <br />
 * File Path:          TestRecursive <br />
 *
 * @author Zhenghua Mu
 * @version 1.0.0
 */
public class TestRecursive
{
    @Test
    public void test()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binSearch(arr, 6));
        hanoi(5, 'A', 'B', 'C');
        int[] arr1 = {3, 243, 13, 44,12,32, 42,51, 74};
        quickSort(arr1,0,arr1.length-1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    // 快速排序算法
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // 对基准值左边的子数组进行快速排序
            quickSort(arr, low, pi - 1);

            // 对基准值右边的子数组进行快速排序
            quickSort(arr, pi + 1, high);
        }
    }

    // 分区函数，将数组分成两部分并返回基准值的位置
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 选择最后一个元素作为基准值
        int i = low - 1; // 记录小于基准值的元素的索引

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // 交换元素
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 将基准值放到正确的位置
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // 返回基准值的索引
    }

    public static int binSearch(int[] naVals, int nSearch)
    {
        return recursiveSearch(naVals, nSearch, 0, naVals.length - 1);
    }

    public static int recursiveSearch(int[] arr, int key, int left, int right)
    {
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (key > arr[mid]) return recursiveSearch(arr, key, mid + 1, right);
            return recursiveSearch(arr, key, 0, mid - 1);
        }
        return -1;
    }

    public static void hanoi(int n, char A, char B, char C)
    {
        if (n == 1)
        {
            System.out.println(n + " from " + A + " ----> " + C);
        } else
        {
            hanoi(n - 1, A, C, B);
            System.out.println(n + " from " + A + " ----> " + C);
            hanoi(n - 1, B, A, C);
        }
    }
}

