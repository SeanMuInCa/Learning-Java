package COSC602.Class0129;

import java.util.Arrays;
import java.util.function.Predicate;

public class FuncPredicate
{
    public static boolean doTest(Predicate<String> p, String str)
    {
        return p.test(str);
    }

    public static void main(String[] args)
    {
        IsPassword p = new IsPassword();
        System.out.println(doTest(p, "aAa1231"));

        Predicate<String> p1 = str -> str.matches("^.*[a-z]$");
        System.out.println(p1.test("adb"));

        String[] names = {"Raina","Fiona","SEAN","S23423Sdaf"};
        Predicate<String> p2 = str -> str.equals(str.toUpperCase());
        for (String s : names)
        {
            if(doTest(new IsAllCaps(), s))
            {
                System.out.println(s+" all caps");
            }
        }

        for (String s : names)
        {
            if(doTest(s1 -> s1.equals(s1.toUpperCase()),s)) System.out.println(s+" all caps");
        }

        for (String sName : names)
        {
            if (doTest(new IsPassword(), sName))
            {
                System.out.println(sName+" is valid");
            }
        }
    }
}
