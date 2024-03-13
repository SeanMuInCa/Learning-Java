package COSC603.Class0306;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator
{
    public static int add(String numbers)
    {
        String delimiter = ",|\n";
        String numbersWithoutDelimiters = numbers;


        if (numbers.startsWith("//"))
        {
            int delimiterStartIndex = numbers.indexOf("[") + 1;
            int delimiterEndIndex = numbers.indexOf("]");
            int numberStartIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(delimiterStartIndex, delimiterEndIndex );
            System.out.println(delimiter);
            numbersWithoutDelimiters = numbers.substring(numberStartIndex + 2);
            System.out.println(numbersWithoutDelimiters);
        }

        return add(numbersWithoutDelimiters, delimiter);
    }

    private static int add(final String numbers, final String delimiter)
    {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        String[] numbersArray = numbers.split(delimiter);

        if(numbers.trim().isEmpty()) return 0;
        for (String number : numbersArray)
        {
            int numberInt = Integer.parseInt(number.trim());
            if(numberInt < 0)
            {
                list.add(numberInt);
            }
            if(numberInt > 1000) numberInt = 0;
            if (!number.trim().isEmpty())
            {
                sum += numberInt;
            }
        }
        if(!list.isEmpty())
        {
            throw new RuntimeException("Negatives are not allowed: " + list);
        }
        return sum;
    }
}