package COSC601.Class1121;

public class Faculty extends Employee
{
    public Faculty(){
        System.out.println("no param in Faculty constructor is called");
    }
}
class TestChain
{
    public static void main(String[] args)
    {
        Faculty f = new Faculty();
    }
}