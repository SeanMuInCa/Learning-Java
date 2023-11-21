package COSC601.Class1109;

public class UsePoint
{
    public static void main(String[] args)
    {
        Point p1 = new Point();
        Point p2 = new Point(3, 5);
        Point p3 = new Point(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p3.setX(5);
        System.out.println(p3);
        changePoint(p1);
        System.out.println(p1);
    }

    private static void changePoint(Point p1)
    {
        p1.setX(2.1);
        p1.setY(2.3);
    }
}
