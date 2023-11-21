package COSC601.Class1026;

public class Practice2
{
    public static void main(String[] args)
    {
//       int[][] temp = new int[3][5];
        int[][] temp = {{11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}};

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        print(temp);
        doubleArray(temp);
        print(temp);
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
            for(int j : i){
                System.out.print(j + " ");
            }
        }
    }
}
