package COSC601.Class1130.Practice;
import java.util.Date;
import java.util.Objects;

public class Student extends Person implements Comparable<Student>, Cloneable
{
    String studentNum;
    Date enrollDate;
    String[] classList;

    public Student(String lastName, String studentNum)
    {
        super(lastName);
        this.studentNum = studentNum;
        this.enrollDate = new Date();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Student o)
    {
        return this.studentNum.compareTo(o.studentNum);
    }

    @Override
    public Student clone()
    {
        try
        {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            Student clone = (Student) super.clone();
            clone.enrollDate = (Date) this.enrollDate.clone();
            return clone;
        } catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    @Override
    public boolean enrol()
    {
        System.out.println("you are enrolled " + this.getLastName());
        return true;
    }

    @Override
    public void print()
    {
        System.out.println("you can print " + this.getLastName());
    }
}
