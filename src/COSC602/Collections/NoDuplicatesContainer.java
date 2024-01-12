package COSC602.Collections;

public class NoDuplicatesContainer<T>
{
    private T[] list;

    public NoDuplicatesContainer()
    {
        this.list = (T[]) new Object[0];
    }

    public NoDuplicatesContainer(T[] list)
    {
        this.list = (T[]) new Object[0];
    }
    public void add( T value )
    {
        //Add new element to the list
        T[] temp = list;
        list = (T[]) new Object[list.length + 1 ];
        System.arraycopy( temp, 0, list, 0, temp.length);
        list[list.length-1] = value;
    }
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
