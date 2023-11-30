package COSC601.Class1130;

public class Owner extends Person
{
    int tax = 100;
    public Owner(String name)
    {
        this.name = name;
    }

    public int getTax()
    {
        return tax;
    }
}
