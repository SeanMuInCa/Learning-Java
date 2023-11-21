package COSC601.Class1024;
import java.util.Scanner;
import java.util.Arrays;

public class Practice1
{
    public static void main(String[] args)
    {
        char[] str = {'a', 'b', 'c'};//Array  a series of variables shared the same name, store a collection of data
        String[] strArr = {"i", "love", "java"};
        int[] count = new int[12];
        System.out.println(strArr.length + " " + count[1]);
        Scanner input = new Scanner( System.in);
        char[] alphabet = new char[26];
        for ( int i=0; i<5; ++i )
        {
            alphabet[i] = input.next().charAt( 0 );
        }
        System.out.println(alphabet);
    }
}
