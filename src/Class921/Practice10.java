package Class921;

import java.util.Scanner;

public class Practice10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0,
                price;
        while (total < 100)
        {
            System.out.println("Total is: " + total + ". Enter a price to add to total");
            price = input.nextDouble();
            total += price;
        }
        System.out.println("Total is: " + total);
    }
}
