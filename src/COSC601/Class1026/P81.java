package COSC601.Class1026;
import java.util.Scanner;
public class P81
{
    public static void main(String[] args)
    {
        double[][] data = new double[3][4];
        System.out.print("Enter a 3−by−4 matrix row by row: ");
        data = createArray(data);
        double res = sumColumn(data, 1);
        System.out.println(res);
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

    public static double sumColumn(double[][] m, int columnIndex)
    {
        if (columnIndex >= m[0].length || columnIndex < 0)
        {
            throw new RuntimeException("out of!!!!");
        }
        double sum = 0;
        for (double[] doubles : m)
        {
            sum += doubles[columnIndex];
        }
        return sum;
    }

    private static void doubleArray(int[][] temp)
    {
        for (int i = 0; i < temp.length; i++)
        {
            for (int j = 0; j < temp[i].length; j++)
            {
                temp[i][j] *= 2;
            }
        }
    }


    private static void print(int[][] copy)
    {
        for (int[] i : copy)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
        }
    }
}
