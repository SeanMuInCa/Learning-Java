package COSC602.Collections;

import java.util.Vector;

public class StudentList
{
//    private Student[] list;
    Vector<Student> list1;
    public StudentList()
    {
//        list = new Student[0];
        list1 = new Vector<>();
    }
    
    /**
     * 
     * Purpose:  Add a student to the list
     * @param stu       Student to be added
     */
    public void addStudent( Student stu )
    {
        //Add new element to the list
        list1.add(stu.clone());
        /*Student[] temp = list;
        list = new Student[list.length + 1 ];
        System.arraycopy( temp, 0, list, 0, temp.length);
        list[list.length-1] = stu.clone();*/
    }
    
    /**
     * 
     * Purpose:  Remove a student from the student list
     * @param stu       Student to be removed
     */
    public void deleteStudent( Student stu )
    {

        list1.remove(stu);
        /*int indexToDelete = -1;
        //Find position of student to remove
        for( int i = 0; i < list.length && indexToDelete == -1; i++ )
        {
            if ( list[i].equals( stu ) )
            {
                indexToDelete = i;
            }
        }*/
        
        //Make sure student was found before deleting
        /*if ( indexToDelete != -1 )
        {
            //Remove student
            Student[] temp = list;
            list = new Student[list.length -1 ];
            
            System.arraycopy( temp, 0, list, 0, indexToDelete );
            System.arraycopy( temp, indexToDelete + 1, list, indexToDelete, list.length - indexToDelete );
        }*/

    }
    
    
    /**
     * 
     * Purpose:  Display all the students in the student list.
     */
    public void displayAll( )
    {
        System.out.println("Student List: " );
        for( Object o : list1 )
        {
            //We know there are Student objects in list 
            Student s = (Student) o;
            s.displayStudent();
        }
    }

}
