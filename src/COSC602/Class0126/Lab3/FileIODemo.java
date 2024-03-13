package COSC602.Class0126.Lab3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileIODemo
{
    public static void main(String[] args)
    {
        BufferedOutputStream bos = null;
        ArrayList<Person> list = new ArrayList<>();
        String str = "asd asdf a dsdf df";
        String[] s = str.split(" ");
        str = str.replace(" ", ",");
        System.out.println(str);
        try{
            bos = new BufferedOutputStream(new FileOutputStream(new File("User.data")));
            bos.write(str.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally
        {
            try
            {
                if(bos != null)
                    bos.close();
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
