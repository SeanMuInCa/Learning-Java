package COSC603.Class0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextData
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myFile = new File("scores.txt");
        Scanner input = new Scanner(myFile);
        int total = 0;
        int num = 0;
        while (input.hasNext())
        {
            String str = input.next();
            int data = input.nextInt();
            total += data;
            num++;
            System.out.println(str + " " + total);
        }
        System.out.println(num);

        input.close();
    }
}
