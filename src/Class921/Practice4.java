package Class921;

import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("How many stars do you want: (-1 for stop)");
            int n = input.nextInt();
            if (n != -1)
            {
                for (int i = 0; i < n; i++)
                {
                    System.out.print('*');
                }
                System.out.println("");
            } else
            {
                flag = false;
            }
        }
    }
}
