package COSC602.Collections;/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 190
 *  Instructors:  Andrea Grzesina, Sharon McDonald
 */

/**
 *  Purpose: Simple list holder.  It provides capability to add and delete elements.   Also
 *  provides the capabilty to display everything in the list. 
 *
 * @author CST100
 * @version 1.0
 */

public class SimpleListHolder<T>
{
    private T[] list;

    /**
     *
     * Constructor for the SimpleListHolder class.
     */
    public SimpleListHolder()
    {
        list = (T[]) new Object[0];
    }


    /**
     *
     * Purpose:  Add a value to the list
     * @param value         Value to be added
     */
    public void add( T value )
    {
        //Add new element to the list
        T[] temp = list;
        list = (T[]) new Object[list.length + 1 ];
        System.arraycopy( temp, 0, list, 0, temp.length);
        list[list.length-1] = value;
    }

    /**
     *
     * Purpose: Remove a value from the list
     * @param value     Value to be removed
     */
    public void delete( T value )
    {

        int indexToDelete = -1;
        //Find position of student to remove
        for( int i = 0; i < list.length && indexToDelete == -1; i++ )
        {
            if ( list[i].equals( value ) )
            {
                indexToDelete = i;
            }
        }

        //Make sure student was found before deleting
        if ( indexToDelete != -1 )
        {
            //Remove student
            T[] temp = list;
            list = (T[]) new Object[list.length -1 ];

            System.arraycopy( temp, 0, list, 0, indexToDelete );
            System.arraycopy( temp, indexToDelete + 1, list, indexToDelete, list.length - indexToDelete );
        }

    }


    public void displayAll( )
    {
        System.out.println("List Contents: " );
        for( T element : list )
        {
            System.out.println( element);;
        }
    }

}