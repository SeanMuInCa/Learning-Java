package COSC603.Class0311;

import java.io.*;

public class TestBinaryFileStream
{
    public static void main(String[] args) throws IOException
    {
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp2.dat"));
                )
        {
            dos.writeUTF("raina");
            dos.writeDouble(12.12);
            dos.writeUTF("rainma");
            dos.writeDouble(9.22);
        }

        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("temp2.dat"));
                )
        {
            System.out.println(dis.readUTF() + " " + dis.readDouble());
            System.out.println(dis.readUTF() + " " + dis.readDouble());

        }
    }
}
