package Class1003;

public class Practice4
{
    public static void main(String[] args)
    {

        for (int i = 1; i <= 10000; i++)
        {

            System.out.print(isNumberPerfect(i) ? i + " " : "");
        }
    }

    public static boolean isNumberPerfect(int number)
    {
        int sum = 1;
        if (number == 1) return true;
        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }
        return sum == number;
    }
}
