package COSC603.Class0311;

import java.io.*;
import java.util.Scanner;

public class Copy
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter input filename: ");
        String sourceName = new Scanner(System.in).nextLine();
        String targetName = sourceName.substring(0, sourceName.indexOf('.')) + "_copy.dat";

        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceName));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetName));
                )
        {
            int r;
            int numberOfBytesCopied = 0;
            while ((r = bis.read()) != -1)
            {
                bos.write((byte) r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}
