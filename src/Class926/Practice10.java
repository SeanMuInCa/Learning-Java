package Class926;

import java.util.Scanner;

public class Practice10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many stars do you want: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = n; i >0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
