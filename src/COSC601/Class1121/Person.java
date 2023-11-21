package COSC601.Class1121;

public class Person
{
    private String name;

    public Person()
    {
        System.out.println("no param Person constructor is called");
    }

    public Person(String name)
    {
        this.name = name;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
