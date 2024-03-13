package COSC602.Class0129;

import java.util.Random;
import java.util.function.Supplier;

public class FunctionalInterface1
{
    public static void main(String[] args)
    {
        Supplier<Integer> supplier = new Supplier<Integer>()
        {
            @Override
            public Integer get()
            {
                return 1;
            }
        };

        Supplier<Integer> supplier1 = () -> {
            Random random = new Random();
            int number = random.nextInt(10);
            while (number >= 5 && number < 8)
            {
                number = random.nextInt(10);
            }
            return number;
        };

        for (int i = 0; i < 10; i++)
        {
            Integer obj = supplier1.get();
            System.out.print(obj + " ");
        }
        System.out.println();

    }
}
