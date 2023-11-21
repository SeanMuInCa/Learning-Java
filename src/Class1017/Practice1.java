package Class1017;
import java.util.Scanner;
public class Practice1
{
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(countWords(str));
    }
    public static int countWords(String str){
        int count = 0;
        if(!((" ".equals(str.substring(0,1))) || (" ".equals(str.substring(str.length() - 1))))){
            for (int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i)==' '){
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
}
