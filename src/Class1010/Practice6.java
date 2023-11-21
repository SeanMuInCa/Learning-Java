package Class1010;

public class Practice6
{
    public static void main(String[] args){
        displayTriangle(5);
        displayTriangle(5,'@');
        displayTriangle(5,'#',false);
    }

    private static void displayTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 2 * (n - i) - 1; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void displayTriangle(int n, char c)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 2 * (n - i) - 1; j > 0; j--)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    private static void displayTriangle(int n, char c, boolean up)
    {

        if(up){
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 2 * (n - i) - 1; j > 0; j--)
                {
                    System.out.print(c);
                }
                System.out.println();
            }
        }else{
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1 - i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++)
                {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

}
