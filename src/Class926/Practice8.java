package Class926;
import java.util.Scanner;
public class Practice8
{
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = n; i >0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
