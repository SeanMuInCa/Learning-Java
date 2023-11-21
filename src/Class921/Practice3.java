package Class921;
import java.util.Scanner;
public class Practice3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many stars do you want: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print('*');
        }
    }
}
