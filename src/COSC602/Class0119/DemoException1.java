package COSC602.Class0119;

import java.util.Scanner;

/* File DemoExceptions01.java */
public class DemoException1
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        String[] words = {"The", "quick", "brown", "fox"};
        System.out.print( "Which word would you like to see? "
                + "Enter a number from 0 through "
                + ( words.length - 1 ) + ": " );
        String line = input.next();
        int index = Integer.parseInt( line.trim() );
        if ( index >= 0 && index < words.length )
        {
            System.out.println( "The word is: " + words[index] );
        }
        else
        {
            System.out.println( "Sorry, " + index
                    + " is not a valid number." );
        }
    }
}