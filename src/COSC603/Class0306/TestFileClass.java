package COSC603.Class0306;

import java.io.File;
import java.util.Date;

public class TestFileClass
{
    public static void main(String[] args)
    {
        File file = new File("path");
        System.out.println("does it exist? " + file.exists());
//        boolean res = file.mkdirs();
//        System.out.println("did we make a directory? " + res);
        System.out.println("are you a directory? " + file.isDirectory());

        File otherFile = new File("path/someWords.txt");
        System.out.println("does it exist? " + otherFile.exists());
        System.out.println("are you a directory? " + otherFile.isDirectory());

        System.out.println("Its length is " + otherFile.length());
        System.out.println("can you be read? " + otherFile.canRead());
        System.out.println("can you be write? " + otherFile.canWrite());
        System.out.println("are you a file? " + otherFile.isFile());

        System.out.println("are you a absolute path " + otherFile.isAbsolute());
        System.out.println("what is your absolute path " + otherFile.getAbsolutePath());
        System.out.println("last modified on " + new Date(otherFile.lastModified()));
    }
}
