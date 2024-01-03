package COSC602.Class0103;

public class TestRecursion
{
    public static void main(String[] args)
    {
        System.out.println(factorial(4));
        System.out.println(fib(4));
    }
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static long fib(long n){
        if(n == 1) return 1;
        if(n == 0) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
