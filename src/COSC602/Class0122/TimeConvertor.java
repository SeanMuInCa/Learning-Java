package COSC602.Class0122;

import java.util.Scanner;

public class TimeConvertor
{
    public static void main(String[] args)
    {
//        System.out.println("input time with hh:mm format! ");
        Scanner input = new Scanner(System.in);
        char con;
//        String time = input.nextLine();
        do
        {
            System.out.println("input time with hh:mm format! ");
            String time = input.nextLine();

            String[] parts = time.split(":");

            int hour = 0;
            int min = 0;
            try
            {
                if(parts.length != 2) throw new InvalidTimeException("your time format is invalid");

                hour = Integer.parseInt(parts[0]);
                if(hour > 23 || hour < 0) throw new InvalidTimeException("your time format is invalid");
                hour = hour >= 13 ? hour - 12 : hour;

                min = Integer.parseInt(parts[1]);
                if(min < 0 || min > 59) throw new InvalidTimeException("your time format is invalid");
            } catch (InvalidTimeException e)
            {
                System.out.println(e.getMessage());
            }

            if(!isNumberString(parts[0]) || isNumberString(parts[1]))
            System.out.println(hour + " : " + min);
            System.out.println("Again? y/n ");
            String ans = input.nextLine();
            con = ans.toLowerCase().charAt(0);
        }while (con == 'y');
    }

    private static boolean isNumberString(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if(!isNumberString(s.charAt(i))) return false;
        }
        return true;
    }
    private static boolean isNumberString(char c)
    {
        if(c >= '0' && c<='9') return true;
        return false;
    }
}
