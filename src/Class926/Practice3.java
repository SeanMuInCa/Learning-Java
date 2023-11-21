package Class926;

import java.util.Scanner;

public class Practice3
{
    public static void main(String[] args)
    {
        double total = 0;
        double marks;
        int num = 0;
        do
        {
            System.out.print("Enter a grade or -1 to quit: ");
            Scanner input = new Scanner(System.in);
            marks = input.nextDouble();
            total += marks;
            num++;
        } while (marks != -1);
        num--;
        total++;
        System.out.println(total / num);
    }
}
