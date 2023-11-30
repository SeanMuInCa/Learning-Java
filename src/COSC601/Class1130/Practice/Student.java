package COSC601.Class1130.Practice;
import java.util.Date;
import java.util.Objects;

public class Student extends Person implements Comparable<Student>
{
    String studentNum;
    Date enrollDate;
    String[] classList;

    public Student(String lastName, String studentNum)
    {
        super(lastName);
        this.studentNum = studentNum;
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
}
