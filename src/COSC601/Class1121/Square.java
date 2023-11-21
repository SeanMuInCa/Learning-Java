package COSC601.Class1121;

public class Square extends GeoSomethingObject
{
    private int side = 10;
    public Square()
    {
    }
    public Square(String color)
    {
        //super(color);
        super.color = color;
    }

    @Override
    public int getArea()
    {
        return side * side;
    }
}
class Test{
    public static void main(String[] args)
    {
        Square s = new Square("red");
        Rectangle r = new Rectangle(10,5);
        System.out.println(r.getArea());
        System.out.println(s.getArea());
        System.out.println(s.getColor());
    }
}
