package Class1003;

import java.util.Scanner;

public class Practice3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rows, cols;
        do
        {
            System.out.print("Enter rows(1~24): ");
            rows = input.nextInt();
        } while (rows < 1 || rows > 24);
        do
        {
            System.out.print("Enter cols(1~80): ");
            cols = input.nextInt();
        } while (cols < 1 || cols > 80);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
