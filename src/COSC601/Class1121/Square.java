package COSC601.Class1121;

public class Square extends GeoSomethingObject
{

    private int side;

    public int getSide()
    {
        return side;
    }

    public void setSide(int side)
    {
        this.side = side;
    }

    public Square()
    {
        setSide(10);
    }
    public Square(String color)
    {
        //super(color);
        super.color = color;
    }

    @Override
    public int getArea()
    {
        return getSide() * getSide();
    }

    @Override
    public String toString()
    {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }
}

