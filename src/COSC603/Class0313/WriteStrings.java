package COSC603.Class0313;

import java.io.*;
import java.util.Arrays;

public class WriteStrings
{
    public static void main(String[] args) throws IOException
    {
        String str = "abc123ABC\u0100e";
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("strings.dat"));
                )
        {
//            dos.writeUTF(str);//write as string
            dos.writeBytes(str);//write as bytes so ASCII
        }
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("stringChars.dat"));
        )
        {
//            dos.writeUTF(str);//write as string
//            dos.writeBytes(str);//write as bytes so ASCII
            dos.writeChars(str);//unicode encoding (2bytes / char)
        }


        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("strings.dat"));
                )
        {
            String s = Arrays.toString(dis.readAllBytes());
            System.out.println(s);
        }
    }
}
