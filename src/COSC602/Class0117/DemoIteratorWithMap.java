package COSC602.Class0117;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;


public class DemoIteratorWithMap
{

    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {
        HashMap<Integer, Student>  studentList = new HashMap<Integer, Student>();

        //Add a couple of students
        Student bob = new Student("Bob", "Brown", "403-222-2222" );
        studentList.put( 1001, bob );
        Student sally = new Student( "Sally", "Brown", "306-111-1111" );
        studentList.put( 2001, sally );

        /*
         * To retrieve elements from the map as pairs make use of the Map.Entry
         * class in Java.  This allows two Objects to be stored as a pair.  Map.Entry
         * supports generics so make sure to include the two Object types used in the
         * original map.
         */
        Set<Map.Entry<Integer, Student> > setList = studentList.entrySet();

        /*
         * Now get an iterator on this set.  Each element access by the Iterator
         * will be a Map.Entry object which maintains the key, value pair from the
         * map.
         */

        Iterator<Map.Entry<Integer,Student>> iter = setList.iterator();

        while( iter.hasNext() )
        {
            Map.Entry<Integer, Student> element = iter.next();

            System.out.println("\nKey: " + element.getKey() );

            System.out.print("Value:");
            Student elementValue = element.getValue();


            elementValue.displayStudent();

        }

        System.out.println("-----------------------");
        for (Map.Entry<Integer,Student> m : setList){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
        System.out.println("-----------------------");

        setList.forEach((pair) -> System.out.println(pair.getKey() + " --- " + pair.getValue()));
        System.out.println("-----------------------");
        studentList.forEach((k,v) -> System.out.println(k + " ---- " + v));
    }

}
