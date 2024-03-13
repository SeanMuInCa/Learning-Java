package COSC603.Class0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTestData
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myFile = new File("scores.txt");
        if(myFile.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }

        PrintWriter pw = new PrintWriter(myFile);

        pw.print("hello ");
        pw.printf("%d", 2024);
        pw.println();
        pw.print("world ");
        pw.println(2025);

        pw.close();
    }
}
