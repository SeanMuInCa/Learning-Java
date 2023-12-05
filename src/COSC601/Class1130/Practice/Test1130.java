package COSC601.Class1130.Practice;

import java.util.Date;

public class Test1130
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Doe", "1001");
        Student s2 = new Student("Doe", "1002");
        Faculty f1 = new Faculty("Doe", "1001", "HR");
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1);
        System.out.println(f1);

        s1.setFirstName("John");
        s1.setAddress("203, herold terr");
        s1.setPhoneNum("123-456-7890");
        System.out.println("----------------");
        Student s3 = s1.clone();
        System.out.println("Before change the date");
        System.out.println(s1.enrollDate);
        System.out.println(s3.enrollDate);
        s1.enrollDate = new Date(14565615156156l);
        System.out.println("After change the date");
        System.out.println(s1.enrollDate);
        System.out.println(s3.enrollDate);
        System.out.println("----------------");
        s1.enrol();
        s2.enrol();
        s1.print();
        f1.enrol();
        f1.print();
    }
}
