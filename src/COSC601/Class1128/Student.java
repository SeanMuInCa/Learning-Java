package COSC601.Class1128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student implements Comparable<Student>, Cloneable
{
    private String studentNum;
    private String studentName;
    private int studentAge;
    public String[] hobbys = {"sing","dance"};

    public Student(String studentNum, String studentName, int studentAge)
    {
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentNum()
    {
        return studentNum;
    }

    public void setStudentNum(String studentNum)
    {
        this.studentNum = studentNum;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public int getStudentAge()
    {
        return studentAge;
    }

    public void setStudentAge(int studentAge)
    {
        this.studentAge = studentAge;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", hobbys=" + Arrays.toString(hobbys) +
                '}';
    }

    @Override
    /*public int compareTo(Student o)
    {
        return this.getStudentName().compareTo(o.getStudentName());
    }*/
    public int compareTo(Student o)
    {
        return this.studentAge - o.studentAge;
    }

    @Override
    public Student clone()
    {
        try
        {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }
}

class Test{
    public static void main(String[] args)
    {
        Student s1 = new Student("abc","micheal", 19);
        Student s2 = new Student("abc","apple", 14);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        Collections.sort(list);
        for (Student s : list){
            System.out.println(s.getStudentName());
        }
        Student s3 = s1.clone();
        s1.hobbys[0] = "hello";
        System.out.println(s3);
    }
}