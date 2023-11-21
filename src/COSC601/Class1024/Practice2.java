package COSC601.Class1024;

import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        System.out.print("Enter letters one by one: ");
        Scanner input = new Scanner(System.in);
        char[] alphabet = new char[6];
        for (int i = 0; i < alphabet.length; i++)
        {
            alphabet[i] = input.next().charAt(0);
        }
        System.out.print("Hello ");
        System.out.println(alphabet);
//        System.out.println();
        System.out.println(alphabet.length);
    }
}
