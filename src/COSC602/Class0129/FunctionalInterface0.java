package COSC602.Class0129;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface0
{
    public static void main(String[] args)
    {
        /*int target = 12;

        Function<Integer, Integer> time4 = t1 -> t1 * 4;

        System.out.println(doOper(time4, target));

        System.out.println(doOper(new Times2<>(), target));

        Integer[] items = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(items);
        list.forEach(t -> System.out.println(doOper(time4, t)));
        list.forEach(t -> System.out.println(doOper(new Times2<>(), t)));*/
        System.out.println(test());

    }

    private static String test()
    {
        for (int i = 0; i < 6; i++)
        {
            if(i == 1) return "a";
        }
        return "b";
    }

    public static int doOper(Function<Integer, Integer> oper, Integer target)
    {
        return oper.apply(target);
    }
}
