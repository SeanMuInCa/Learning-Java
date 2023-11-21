public class JaggedArray
{
    public static void main(String[] args)
    {
        int[][] jaggedArray = {{1,2,3},{4,5},{6,7,8}};
        int[][] newJagged = doubleJagged(jaggedArray);
        printArray(newJagged);
    }

    private static void printArray(int[][] newJagged)
    {
        for (int i = 0; i < newJagged.length; i++)
        {
            for (int j = 0; j < newJagged[i].length; j++)
            {
                System.out.printf("%-10d", newJagged[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] doubleJagged(int[][] jaggedArray)
    {
        int[][] newArr = new int[jaggedArray.length][];
        for (int i = 0; i < jaggedArray.length; i++)
        {
            newArr[i] = new int[jaggedArray[i].length];
        }
        for (int i = 0; i < jaggedArray.length; i++)
        {
            for (int j = 0; j < jaggedArray[i].length; j++)
            {
                newArr[i][j] = jaggedArray[i][j] * 2;
            }
        }
        return newArr;
    }
}
