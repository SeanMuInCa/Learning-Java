package Class926;

import java.util.Scanner;

public class Practice6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many stars do you want: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
