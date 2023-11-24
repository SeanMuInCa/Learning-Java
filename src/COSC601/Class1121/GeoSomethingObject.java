package COSC601.Class1121;

public abstract class GeoSomethingObject
{
    protected String color = "blue";
    private int side;

    public GeoSomethingObject()
    {
    }

    public GeoSomethingObject(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public abstract int getArea();

}
