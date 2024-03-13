package COSC603.Class0313;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile
{
    public static void main(String[] args) throws IOException
    {
        try(
                RandomAccessFile operator = new RandomAccessFile("random.dat","rw");
                )
        {
            operator.setLength(0);//clear the file if exists

            for (int i = 0; i < 200; i++)
            {
//                operator.write(i);//different results
                operator.writeInt(i);//save as a integer every one stores in 4bytes
            }

            System.out.println("The length is " + operator.length());

            operator.seek(0);// move the pointer back to 0 position

            System.out.println("The first number is " + operator.readInt());

            System.out.println("The second number is " + operator.readInt());

            operator.seek(4 * 10);//byte
            System.out.println("The current number is " + operator.readInt());

            operator.writeInt(666);
            operator.seek(operator.length());
            operator.writeInt(999);
            System.out.println("add a new number the new length is "+operator.length());

            operator.seek(44);
            System.out.println(operator.readInt());

            System.out.println();
            operator.seek(0);
            for (int i = 0; i < operator.length(); i += 4)
            {
                operator.seek(i);
                System.out.print(operator.readInt() + " ");
                if(i % 40 == 0 && i != 0) System.out.println();
            }
        }
    }
}
