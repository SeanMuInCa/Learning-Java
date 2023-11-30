package COSC601.Class1130;

public class Instructor extends Person
{
    int salary;
    public Instructor(){}
    public Instructor(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }
}
