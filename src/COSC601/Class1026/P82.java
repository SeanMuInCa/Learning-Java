package COSC601.Class1026;

import java.util.Scanner;

public class P82
{
    public static void main(String[] args)
    {
        double[][] data = new double[4][4];
        System.out.print("Enter a 4−by−4 matrix row by row: ");
        data = createArray(data);
        double res = sumMajorDiagonal(data);
        System.out.println("Sum of the elements in the major diagonal is " + res);
    }

    private static double[][] createArray(double[][] m)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }

    public static double sumMajorDiagonal(double[][] m)
    {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
        {
            sum += m[i][i];
        }
        return sum;
    }
}
