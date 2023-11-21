package Class1005;

import java.util.Scanner;

public class Practice3
{
    public static void main(String[] args)
    {
        System.out.print("Input two numbers: ");
        double num1, num2;
        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        System.out.println("The absolute is: " + Math.abs(num1));
        System.out.println("The max is: " + Math.max(num1, num2));
        System.out.println("The closest is: " + Math.round(num1));
        System.out.println("The value is: " + Math.pow(num1, num2));
    }
}
