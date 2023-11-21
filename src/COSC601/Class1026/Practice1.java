package COSC601.Class1026;

import java.util.Arrays;

public class Practice1
{
    public static void main(String[] args)
    {
        int[] temp = {1,2,3,4,5,6,7};
        int[] copy = new int[4];
        System.arraycopy(temp,3,copy,0,4);
        print(copy);
        System.out.println();
        print(temp);
    }

    private static void print(int[] copy)
    {
        for (int j : copy)
        {
            System.out.print(j + " ");
        }
    }
}
