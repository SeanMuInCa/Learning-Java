package COSC602.Comparator_Cloneble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

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
        System.out.println("@@@@@@@@@@@@@@@@@@");
        ArrayList<String> container = new ArrayList<>(Arrays.asList(list));
        for (String s : container)
        {
            System.out.print(s + " ");
        }
        Iterator<String> it = container.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        container.forEach(str -> System.out.println(str + " "));
    }
}
