package COSC601.Class1121;

public class Rectangle extends GeoSomethingObject
{
    private int length;
    private int width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea()
    {
        return this.length * this.width;
    }
}
