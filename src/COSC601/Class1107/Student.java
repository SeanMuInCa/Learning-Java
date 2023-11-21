package COSC601.Class1107;

import java.util.Objects;

public class Student
{
    private String name;
    private float grade;
    public static int id = 1000;

    public Student(String name, float grade)
    {
        setName(name);
        setGrade(grade);
        setId(++id);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name.isEmpty() ? "Dummy" : name;
    }

    public float getGrade()
    {
        return grade;
    }

    public void setGrade(float grade)
    {
        this.grade = grade > 0 ? grade : 1;
    }

    public int getId()
    {
        return id;
    }

    private void setId(int id)
    {
        Student.id = id;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(grade, student.grade) == 0 && id == student.id && this.name.equals(student.name);
    }



}
