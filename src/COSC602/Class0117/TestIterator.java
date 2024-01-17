package COSC602.Class0117;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestIterator
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("banana" );
        fruits.add( "pear");
        fruits.add( "watermelon" );
        fruits.add( "orange" );

        ListIterator<String> iter = fruits.listIterator();

        //Display elements moving forward through the list
        System.out.println("Move forward through list: \n");
        while( iter.hasNext() )
        {
            String currElement = iter.next();
            System.out.println(currElement);
        }

        System.out.println("\n********************************" );
        System.out.println("Move backward through the list: \n");

        while( iter.hasPrevious() )
        {
            String currElement = iter.previous();
            System.out.println(currElement );
        }
    }
}
