package COSC601.Class1107;

public class Cube
{
    private double length;
    private double width;
    private double height;

    public Cube()
    {
        this(0,0,0);
    }

    public Cube(double length, double width, double height)
    {
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length)
    {
        this.length = length < 0 ? 0 : length;
    }

    public void setWidth(double width)
    {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height)
    {
        this.height = height < 0 ? 0 : height;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public String toString()
    {
        return "Cube{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
