package COSC602.Class0103;

public class TestRecursion
{
    public static void main(String[] args)
    {
        System.out.println(factorial(4));
    }
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}
