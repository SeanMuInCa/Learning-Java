package COSC602.Comparator_Cloneble;

import java.util.Date;

public class House implements Cloneable, Comparable<House>
{
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area)
    {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId()
    {
        return id;
    }

    public double getArea()
    {
        return area;
    }

    public java.util.Date getWhenBuilt()
    {
        return whenBuilt;
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(House o)
    {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
    public Object clone() throws CloneNotSupportedException
    {
        House house_copy = (House) super.clone();
        house_copy.whenBuilt = (Date) this.whenBuilt.clone();
        return house_copy;
    }

    public static void main(String[] args)
    {
        try {
            House houseGeorge = new House(2, 2000);
            House houseCloned = (House) houseGeorge.clone();
            System.out.println("House deep copied? " +
                    (houseGeorge.getWhenBuilt() != houseCloned.getWhenBuilt()));
        }
        catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
