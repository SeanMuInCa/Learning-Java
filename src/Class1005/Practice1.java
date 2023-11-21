package Class1005;
import java.util.Scanner;
public class Practice1
{
    public static void main(String[] args){
        System.out.print("Enter rows: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
