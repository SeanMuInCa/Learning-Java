package COSC601.Class1026;

public class Practice3
{
    public static void main(String[] args)
    {
        int[][] arr = new int[5][7];
        init(arr);
        print(arr);
        draw(arr);
    }

    private static void draw(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] % 2 ==0){
                    System.out.print(' ');
                }else{
                    System.out.print('|');
                }
            }
            System.out.println();
        }
    }

    private static void print(int[][] copy)
    {
        for (int[] i : copy)
        {
            for(int j : i){
                System.out.printf("%5d ", j);
            }
            System.out.println();
        }
    }
    private static void init(int[][] Arr)
    {
        Arr[0][0] = 2;
        Arr[0][1] = -3;
        Arr[0][2] = 5;
        Arr[0][3] = 777;
        Arr[0][4] = 89;
        Arr[0][5] = -9;
        Arr[0][6] = 44;
        Arr[1][0] = 22;
        Arr[1][1] = 30;
        Arr[1][2] = -2;
        Arr[1][3] = 43;
        Arr[1][4] = 0;
        Arr[1][5] = 10;
        Arr[1][6] = 20;
        Arr[2][0] = 30;
        Arr[2][1] = 32;
        Arr[2][2] = 322;
        Arr[2][3] = 9;
        Arr[2][4] = 56;
        Arr[2][5] = 88;
        Arr[2][6] = -888;
        Arr[3][0] = 45;
        Arr[3][1] = 8;
        Arr[3][2] = 88;
        Arr[3][3] = 89;
        Arr[3][4] = 88;
        Arr[3][5] = 82;
        Arr[3][6] = 86;
        Arr[4][0] = 98;
        Arr[4][1] = 99;
        Arr[4][2] = 99;
        Arr[4][3] = 98;
        Arr[4][4] = 96;
        Arr[4][5] = -94;
        Arr[4][6] = 92;
    }


}
