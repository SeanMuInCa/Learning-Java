package COSC602.Class0117;

import java.util.HashMap;
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
public class DemoMap
{
    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {
        //HashMap supports generics, allows specfication of the data type for the key and for the values
        HashMap<Integer, Student>  studentList = new HashMap<Integer, Student>();
        Student bob = new Student("Bob", "Brown", "403-222-2222" );
        //Maps use put instead of add
        studentList.put( 1001, bob );
        Student sally = new Student( "Sally", "Brown", "306-111-1111" );
        studentList.put( 2001, sally );
        //Display list
        System.out.println(studentList);
        //Retrieve value by key
        Student s = studentList.get( 2001 );
        if ( s.equals( sally ) )
        {
            System.out.println("\nMap correctly retrieved Sally!");
        }
    }
}