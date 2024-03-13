package COSC603.Class0311;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTextDataWithAutoClose
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //try-with-resources opens resource
        //and automatically closes it for us
        try(PrintWriter pw = new PrintWriter("file2.txt");)//this means try-with-resources
        {
            pw.print("hello again ");
            pw.println(2024);
        }
    }
}
