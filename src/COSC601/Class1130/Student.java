package COSC601.Class1130;

public class Student extends Person
{
//    String name;
    int GPA;

    public Student()
    {
    }

    public Student(String name, int GPA)
    {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName()
    {
        return name;
    }

    public int getGPA()
    {
        return GPA;
    }
}
