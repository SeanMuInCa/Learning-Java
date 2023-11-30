package COSC601.Class1130;

import java.util.ArrayList;

public class TestPerson
{
    public static void main(String[] args)
    {
        Student s = new Student("abc",5);
        Instructor i = new Instructor("def",1000);
        Owner o = new Owner("mzh");

        ArrayList<Person> list = new ArrayList<>();

        list.add(s);
        list.add(i);
        list.add(o);

        for (Person p : list){
            p.speak();
            if(p instanceof Student){
//                p = (Student)p;
                System.out.println(((Student)p).getGPA());
            }
            if(p instanceof Instructor){
//                p = (Student)p;
                System.out.println(((Instructor)p).getSalary());
            }
            if(p instanceof Owner){
//                p = (Student)p;
                System.out.println(((Owner)p).getTax());
            }
        }
    }
}
