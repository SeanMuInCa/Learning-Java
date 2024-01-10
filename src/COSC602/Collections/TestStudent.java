package COSC602.Collections;

public class TestStudent
{
    public static void main(String[] args)
    {

        Student bob = new Student("Bob", "Brown", "306-222-2222");
        Student jane = new Student("Jane", "Smith", "306-111-1111");
        Student tom = new Student("Tom", "Doe", "587-333-3333" );
        Student sally = new Student("Sally", "Doe", "406-444-4444" );
        
        StudentList list = new StudentList();
        list.addStudent( bob );
        list.addStudent( jane );
        list.addStudent( tom );
        list.addStudent( sally );
        
        list.displayAll();
        
        list.deleteStudent( jane );
        
        list.displayAll();
        list.deleteStudent( sally );
        list.displayAll();
        list.deleteStudent( bob );
        list.displayAll();

    }

}
