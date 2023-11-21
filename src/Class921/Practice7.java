package Class921;

import java.util.Scanner;

public class Practice7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = input.nextInt();
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i + 1) * n + " ");
        }
    }
}
