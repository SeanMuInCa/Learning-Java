package COSC601.Class1123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmpProgram
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("ab");
        list.add("bc");
        list.add("cd");
        list.add("de");
        list.add("ef");
        list.add("ab");
        System.out.println(list);

        ArrayList<String> updateList = new ArrayList<>();
        updateList.add("Calgary");
        updateList.add("Edmonton");

        updateList.addAll(list);
        System.out.println(updateList);

        updateList.remove("ef");
        System.out.println(updateList);
        updateList.add(2,"Saskatoon");
        System.out.println(updateList);

        Collections.sort(updateList);
        System.out.println(updateList);
    }
}
