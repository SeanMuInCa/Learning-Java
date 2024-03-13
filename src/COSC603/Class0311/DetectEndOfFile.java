package COSC603.Class0311;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DetectEndOfFile
{
    public static void main(String[] args) throws IOException
    {
        try(
                DataInputStream fis = new DataInputStream(new FileInputStream("temp2.dat"));
                )
        {
            while (true)
            {
                System.out.println(fis.readUTF() + " " + fis.readDouble());
            }
        }catch (Exception e)
        {
            System.out.println("end");
        }
    }
}
