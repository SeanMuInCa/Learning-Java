package COSC603.Class0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText
{
    public static void main(String[] args) throws FileNotFoundException
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input file name: ");
        String str1 = input.nextLine();

        System.out.println("Enter an output file name: ");
        String str2 = input.nextLine();

        System.out.println("Enter a string to replace: ");
        String strTarget = input.nextLine();

        System.out.println("Enter a string to replace it with: ");
        String strReplace = input.nextLine();

        File file = new File(str1);
        if(!file.exists())
        {
            System.out.println("Does not exist");
            System.exit(1);
        }

        try(
                Scanner input2 = new Scanner(file);
                PrintWriter pw = new PrintWriter(str2);
        )
        {
            while (input2.hasNext())
            {
                String s1 = input2.nextLine();
                String s2 = s1.replace(strTarget,strReplace);
                pw.println(s2);
            }
        }
    }
}
