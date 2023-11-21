package Class926;

import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        int total = 0;

        int sales;

        int num = 0;

        do
        {
            System.out.println("Enter your sales or -1 to stop: ");
            Scanner input = new Scanner(System.in);
            sales = input.nextInt();
            total += sales;
            num++;
        } while (sales != -1);
        num--;
        total++;

        System.out.println(num + " " + total/num);
    }
}
