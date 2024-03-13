package COSC603.Class0313;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream
{
    public static void main(String[] args) throws IOException
    {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"))
                )
        {
            oos.writeUTF("hello");
            oos.writeDouble(99.99);
            oos.writeObject(new Date());
        }
    }
}
