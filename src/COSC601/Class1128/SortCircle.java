package COSC601.Class1128;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SortCircle
{
    public static void main(String[] args)
    {
        ArrayList<Circle> list = new ArrayList<>();

        list.add(new Circle());
        list.add(new Circle(5));
        list.add(new Circle(3));
        list.add(new Circle(2));

        for(Circle c : list){
            System.out.println(c.getRadius());
        }
        System.out.println("-----------");
        Collections.sort(list);//implements the Comparable interface first
        for(Circle c : list){
            System.out.println(c.getRadius());
        }
    }
}
