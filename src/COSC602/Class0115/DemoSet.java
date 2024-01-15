package COSC602.Class0115;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {

    public static void main(String[] args) {

        HashSet<String> setOfStrings = new HashSet<>();

        setOfStrings.add("One");
        setOfStrings.add("Two");
        setOfStrings.add("Three");
        setOfStrings.add("Four");
        setOfStrings.add("Five");
        setOfStrings.add("Five");

        System.out.println("Initial set : " + setOfStrings);
        setOfStrings.remove("Three");
        System.out.println("Set after removing one of the values: " + setOfStrings);

        HashSet<String> removeSet = new HashSet<>();
        removeSet.add("Two");
        removeSet.add("Three");
        removeSet.add("Ten");

        setOfStrings.removeAll(removeSet);
        System.out.println("Set after removing a list of values: " + setOfStrings);

        System.out.println("--------------------------------");

        TreeSet<String> treesetOfStrings = new TreeSet<>();

        treesetOfStrings.add("One");
        treesetOfStrings.add("Two");
        treesetOfStrings.add("Three");
        treesetOfStrings.add("Four");
        treesetOfStrings.add("Five");
        treesetOfStrings.add("Five");

        System.out.println("A tree set of the same data showing ordering: " + treesetOfStrings);
    }
}







