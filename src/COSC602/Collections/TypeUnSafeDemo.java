package COSC602.Collections;

import java.util.Vector;

/*
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

public class TypeUnSafeDemo
{

    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {

        Vector<String> sample = new Vector<>();

        sample.add( "Bob" );

        sample.add("banana" );

//        sample.add( 12 );

        for( String o : sample )
        {
            System.out.println( "Length of word is " + o.length() );
        }

    }

}







