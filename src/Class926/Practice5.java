package Class926;

import java.util.Scanner;

public class Practice5
{
    public static void main(String[] args)
    {
        int number = 0;
        int biggest = 0;
        boolean again = true;
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Input a number: ");
            number = scanner.nextInt();
            biggest = Math.max(number, biggest);


        } while (number >= 0 && number <= 10000);
        System.out.println(biggest);
    }
}
