package COSC602.Class0103;

import java.util.Arrays;

public class TestRecursion
{
    public static void main(String[] args)
    {
        /*System.out.println(isPalindrome("helleh"));
        System.out.println(factorial(4));
        System.out.println(fib(4));
        nPrint("hello", 5);*/
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binSearch(arr, 5));
    }
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static long fib(long n){
        if(n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void nPrint(String msg, int times){
        if(times >= 1){
            System.out.println(msg + times);
            nPrint(msg, times - 1);
        }
        if(times == 0) System.exit(0);
    }
    public static boolean isPalindrome(String s){
        if(s.length() <= 1) return true;
        if(s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1,s.length() - 1));
    }
    public static int binSearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == key) return mid;
            int[] newArr = new int[arr.length / 2];
            if(arr[mid] > key){
                System.arraycopy(arr,0,newArr,0,arr.length / 2);
                return binSearch(newArr, key);
            }else{
                System.arraycopy(arr,mid,newArr,0,arr.length / 2);
                return binSearch(newArr, key);
            }
        }
        return -1;
    }
}
