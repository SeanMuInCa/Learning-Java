package Class1005;

import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args)
    {
        printHi();
        print50Stars();
    }
    public static void printHi(){
        System.out.println("Hello");
    }
    public static void print50Stars(){
        for (int i = 0; i < 50; i++)
        {
            System.out.print("*");
        }
    }
}
