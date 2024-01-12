package COSC602.Comparator_Cloneble;

import java.util.Arrays;
import java.util.Comparator;

public class GenericSortComparatorDemo
{
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
    {
        boolean needNextPass = true;

        for (int i = 0; i < list.length && needNextPass; i++)
        {
            //array may be sorted and next pass not needed
            needNextPass = false;
            for (int j = 0; j < list.length - i - 1; j++)
            {
                if(comparator.compare(list[j],list[j + 1]) > 0)
                {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        String[] list = {"Java", "C", "C#", "C++", "JavaScript"};
        bubbleSort(list, (s1,s2) -> - (s1.length() - s2.length()));
        Arrays.stream(list).toList().forEach(System.out::println);
    }
}
