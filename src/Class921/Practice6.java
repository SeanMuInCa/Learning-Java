package Class921;

import java.util.Scanner;

public class Practice6
{
    public static final int NUMBER = 5;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        float avg = 0.0f;
        for (int i = 0; i < NUMBER; i++)
        {
            System.out.println("Input a numbers: ");
            int n = input.nextInt();
            sum += n;
        }
        avg = (float) sum / NUMBER;
        System.out.println(avg);
    }
}
