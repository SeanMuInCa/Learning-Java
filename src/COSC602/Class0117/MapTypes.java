package COSC602.Class0117;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // Create a TreeMap from the preceding HashMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        // Display each entry with name and age
        System.out.print("\nNames and ages are ");
        treeMap.forEach(
                (name, age) -> System.out.print(name + ": " + age + " "));
    }
}
