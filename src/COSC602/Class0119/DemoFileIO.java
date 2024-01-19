package COSC602.Class0119;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoFileIO
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        try(
                Scanner input = new Scanner(new File("d:\\test.txt"));
                )
        {
            while (input.hasNext())
            {
                String str = input.nextLine();
                sb.append(str.replaceAll("a", "b")).append("\r\n");
            }
            System.out.println(sb);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try(PrintWriter printWriter = new PrintWriter(new File("d:\\test.txt")))
        {
            printWriter.print(sb);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
