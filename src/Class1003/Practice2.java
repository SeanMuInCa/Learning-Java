package Class1003;

public class Practice2
{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++)
        {
            System.out.print("\t"+i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(i*(j+1)+"\t");
            }
            System.out.println();
        }
    }
}
