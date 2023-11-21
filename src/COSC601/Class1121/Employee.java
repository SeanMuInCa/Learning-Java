package COSC601.Class1121;

public class Employee extends Person
{
    public Employee()
    {
        this("1 param Employee constructor is called from no param constructor");
        System.out.println("no param Employee sub class constructor is called");
    }
    public Employee(String str){
        System.out.println("1 param Employee sub class constructor is called");
    }
}
