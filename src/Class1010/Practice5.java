package Class1010;
import java.util.Scanner;

public class Practice5
{
    public static void main(String[] args){
        displayTriangle('@');
    }

    private static void displayTriangle(char c)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
