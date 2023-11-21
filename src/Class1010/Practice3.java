package Class1010;
import java.util.Scanner;
public class Practice3
{
    public static void main(String[] args){
        System.out.print("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        System.out.println(getWord(str));
        System.out.println(getWord(str,3));
    }

    public static String getWord(String str)
    {
        return str.contains(" ") ? str.substring(0,str.indexOf(" ")) : str;
    }
    private static String getWord(String str, int number)
    {
        String res = "";
        int left = 0;
        if(number == 1) return getWord(str);
        else{
            for (int i = 0; i < number; i++)
            {
                res = getWord(str.trim());
                if(str.contains(" ")){

                    str = str.substring(str.indexOf(" "));
                    str = str.trim();
                }else break;
            }
            return res;
        }
    }
}
