package Class926;

import java.util.Scanner;

public class Practice1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many stars do you want: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
