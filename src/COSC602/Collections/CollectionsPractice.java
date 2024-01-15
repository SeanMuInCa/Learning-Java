package COSC602.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *  Purpose: Starting template for a new program. Replace these comments with
 *  your own. Briefly describe the purpose of the class, how the class is used
 *  in the program and how it interacts with other classes.
 *  Use the starting file provided here. This file contains the class declaration and an array containing a number of names.
 * Add code to:
 * Declare and instantiate an object reference, called myCollection, of type ArrayList to hold Strings
 * Use the addAll method on the Collections class to add the list of names already defined in the file to myCollection
 * Sort myCollection based on natural order
 * Display myCollection
 * Find maximum and minimum value based on natural order
 * @author CST100
 * @version 1.0
 */

public class CollectionsPractice
{

    public static final String[] NAME_LIST = { "Bob", "Barney", "Adam", "Tom", "Warren", "Manuel", "Curtis", "Fred", "Hal", "Fredrick", "Al" };

    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {
        ArrayList<String> myCollection = new ArrayList<>();
        myCollection.addAll(Arrays.asList(NAME_LIST));
        Collections.sort(myCollection);
        for (String s : myCollection){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Max: "+ Collections.max(myCollection));
        System.out.println("Min: "+ Collections.min(myCollection));
        System.out.println("---------------------------------");
        LengthComparator com = new LengthComparator();
        myCollection.sort(com);
        for (String s : myCollection){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Max: "+ Collections.max(myCollection, com));
        System.out.println("Min: "+ Collections.min(myCollection, com));
    }

}