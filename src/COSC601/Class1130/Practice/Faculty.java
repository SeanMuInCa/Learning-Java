package COSC601.Class1130.Practice;

import java.util.Objects;

public class Faculty extends Person implements Comparable<Faculty>
{
    String employeeNum;
    String department;
    String[] courses;

    public Faculty(String lastName, String employeeNum, String department)
    {
        super(lastName);
        this.employeeNum = employeeNum;
        this.department = department;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(employeeNum, faculty.employeeNum);
    }

    @Override
    public String toString()
    {
        return "Faculty{" +
                "employeeNum='" + employeeNum + '\'' +
                ", department='" + department + '\'' +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Faculty o)
    {
        return this.employeeNum.compareTo(o.employeeNum);
    }

    @Override
    public boolean enrol()
    {
        System.out.println("you are enrolled in " + this.department + " " + this.lastName);
        return false;
    }

    @Override
    public void print()
    {
        System.out.println("you can print " + this.getLastName());
    }
}
