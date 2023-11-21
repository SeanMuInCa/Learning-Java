package Class1010;

import java.util.Scanner;

public class Practice1
{
    public static void main(String[] args)
    {
        System.out.print("Enter two ints: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(power(num1, num2));
        System.out.println("answer is " + Math.pow(num1, num2));
    }

    public static double power(int num1, int num2)
    {
        return num2 < 0 ? powerNegtive(num1, num2) : powerPostive(num1, num2);
    }

    private static double powerNegtive(int num1, int num2)
    {
        long result = 1;
        for (int i = 0; i < num2 * -1; i++)
        {
            result *= num1;
        }
        return 1.0 / result;
    }

    private static double powerPostive(int num1, int num2)
    {
        long result = 1;
        for (int i = 0; i < num2; i++)
        {
            result *= num1;
        }
        return result;
    }
}
