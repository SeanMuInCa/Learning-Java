package COSC602.Class0117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * Practice Using an Iterator
 * Write a program to create a collection of Integer values. Randomly generate 20 numbers between 1 and 100.
 * Add these numbers to the collection. Use an iterator to step through the collection and remove all elements
 * that are evenly divisible by 3. Afterwards display the size of the collection and the number of removed elements.
 * (Which should add up to 20 )
 */
public class Practice
{

    public static void main(String[] args)
    {
        int size = 20;
        int min = 1;
        int max = 100;
        int ele = 0;
        Integer[] arr = generateArray(size,min,max);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> listRemove = new ArrayList<>();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            ele = it.next();
            if(ele % 3 == 0){
                it.remove();//call this
                listRemove.add(ele);
            }
        }
        display(list);
        System.out.println();
        display(listRemove);
    }

    private static void display(ArrayList<Integer> list)
    {
        for (Integer i : list)
            System.out.print(i + " ");
    }


    private static Integer[] generateArray(int size, int min, int max)
    {
        Random random = new Random();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = random.nextInt(max) + min;
        }
        return arr;
    }
}
