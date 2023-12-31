package COSC601.Class1109;

import java.util.Objects;

public class Point
{
    private double x;
    private double y;

    public Point()
    {
        this(0, 0);
    }

    public Point(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public Point(Point p)
    {
        this(p.x, p.y);
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(x, y);
    }
}
