package COSC602.Collections;

import java.util.ArrayList;

public class ArrayListTest
{

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        /*
         * Programmer can add as many elements as desired.  The ArrayList class takes
         * care of growing the array when necessary
         */
        names.add("Bob");
        names.add("Tom");
        names.add("Sally");
        names.add("Jane");
        names.add("Tom");
        names.add("Kathy");

        System.out.println( names );
        System.out.println("Size? " + names.size() );

        //Remove name at index 1 (zero based like arrays so this removes second item in list )
        names.remove( 1 );

        System.out.println( names );

        //Remove name by element

        names.remove("Sally");

        System.out.println( names );

        System.out.println("Contains Tom? " + names.contains( "Tom") );
        System.out.println("Size? " + names.size() );
    }
}