package COSC603.Class0313;

import java.io.*;
import java.util.Arrays;

public class TestObjectStreamForArray
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        int[] numbers = {1,2,30,400,5000};
        String[] strings = {"a","b","c"};

        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objforarray.dat"));
                )
        {
            oos.writeObject(numbers);
            oos.writeObject(strings);
        }

        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objforarray.dat"));
                )
        {
            int[] array1 = (int[]) ois.readObject();
            String[] array2 = (String[]) ois.readObject();

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
        }
    }
}
