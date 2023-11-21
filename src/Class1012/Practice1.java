package Class1012;

public class Practice1
{
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(fib(n));
        System.out.println(fib1(n));
    }

    public static int fib(int n)
    {
        if (n == 0 || n == 1) return 1;
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static int fib1(int n)
    {
        int pre = 1, cur = 1;
        if (n == 0 || n == 1) return 1;
        else
        {
            for (int i = 1; i < n; i++)
            {
                int temp = pre + cur;
                pre = cur;
                cur = temp;
            }
        }
        return cur;
    }
}
