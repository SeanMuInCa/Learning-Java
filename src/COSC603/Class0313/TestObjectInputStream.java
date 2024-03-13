package COSC603.Class0313;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class TestObjectInputStream
{
    public static void main(String[] args) throws IOException
    {
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"))
                )
        {
            String name = ois.readUTF();
            double v = ois.readDouble();
            Date date = (Date) ois.readObject();
            System.out.println(name);
            System.out.println(date);
            System.out.println(v);
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
