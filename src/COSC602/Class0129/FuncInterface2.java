package COSC602.Class0129;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncInterface2
{
    public static String processString(Function<String,String> oper, String tar)
    {
        return oper.apply(tar);
    }

    public static Double doOper(BiFunction<Integer, Double,Double> oper, Integer hours, Double rate)
    {
        return oper.apply(hours , rate);
    }

    public static Function<String,String> procString = String::toUpperCase;

    public static BiFunction<Integer, Double, Double> calcWage = (h,r) -> h * r;

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Ron", "Rick", "Bryce", "Michael", "Coralee", "George", "Jennifer");

        System.out.println();

        list.forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.forEach(s -> System.out.print(processString(t -> t.toUpperCase(), s) + " "));

        System.out.println();
        list.forEach(s -> System.out.print(procString.apply(s) + " "));

        int hours = 40;
        double rate = 25.0;

        System.out.println();
        System.out.println("salary is " + calcWage.apply(hours,rate));

        System.out.println();

        System.out.print("salary is " + doOper(calcWage,hours,rate));


    }
}
