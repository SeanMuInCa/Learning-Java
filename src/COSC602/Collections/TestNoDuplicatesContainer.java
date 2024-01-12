package COSC602.Collections;/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 180
 *  Instructors: Michael Grzesina, Andrea Grzesina, Sharon McDonald
 *  File path and name: J:\CST\ACOSC180\Template.java (replace with your own)
 */

/**
 *  Purpose: Starting template for a new program. Replace these comments with
 *  your own. Briefly describe the purpose of the class, how the class is used
 *  in the program and how it interacts with other classes.
 *
 * @author YOUR NAME AND CST NUMBER GO HERE
 * @version 1.0
 */

public class TestNoDuplicatesContainer
{

    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {

        NoDuplicatesContainer<String> container = new NoDuplicatesContainer<String>();

        container.add("banana");
        container.add("banana");
        container.add("banana");
        container.add("banana");

        System.out.println("Should only have banana one time: ");
        container.displayAll();

        container.add("apple");
        container.add("pear");
        container.add("banana");
        System.out.println("\nShoud have 3 fruit, no duplicates: ");
        container.displayAll();

        container.delete("banana");
        System.out.println("\nShoud have 2 fruit, no duplicates: ");
        container.displayAll();

        container.add( "banana" );
        System.out.println("\nShoud have 3 fruit, no duplicates: ");
        container.displayAll();

        //TEst with another object type

        NoDuplicatesContainer<Integer> numbers = new NoDuplicatesContainer<Integer>();

        numbers.add( 12 );
        numbers.add( 24 );
        numbers.add( 12 );

        System.out.println("\n\nShould have 2 numbers: " );

        numbers.displayAll();

    }

}