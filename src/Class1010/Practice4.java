package Class1010;
import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args){
        System.out.print("Enter a double: ");
        Scanner input = new Scanner(System.in);
        Double number = input.nextDouble();
        System.out.println(getValidDouble(number));
        String str = "hello world";
        System.out.println(getValidDouble(str,3.0));
    }
    public static double getValidDouble(Double number){
        return number;
    }
    public static String getValidDouble(String str,Double number){
        return str + number;
    }
//    public static String getValidDouble(String str,int min, int max){
//
//    }
}
