package Class1017;
import java.util.Scanner;
public class Practice2
{
    public static void main(String[] args)
    {
        System.out.print("Enter how many rows: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) //row
        {


            for (int j = 1; j <= num; j++)
            {
                if (i == 1 || i == num || i == j || i == num - j + 1 ||  j == 1 || j == num)
                {
                    System.out.print(" * ");
                } else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
