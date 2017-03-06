package Collections;

import java.util.ArrayList;
import java.util.TreeMap;

public class tree {
    public static void main(String[] args) {

        // Creates a TreeMap for types of candy
        TreeMap<Integer,String> candyTreeMap = new TreeMap<Integer, String>();
        candyTreeMap.put(1, "Snickers");
        candyTreeMap.put(2, "Hersheys");
        candyTreeMap.put(3, "Butterfinger");
        candyTreeMap.put(4, "Skittles");
        candyTreeMap.put(5, "MilkDuds");

        // Prints all the values of the candyTreeMap
        System.out.println("Values in TreeMap: " + candyTreeMap);

        // Prints out the first key from the the candyTreeMap
        try {
            System.out.println("First key: " + candyTreeMap.firstKey());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Prints out the first key along with its value of the candyTreeMap
        try {
            System.out.println("First entry: " + candyTreeMap.firstEntry());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Prints out the 2nd value from the candyTreeMap
        try {
            System.out.println("Second value: " + candyTreeMap.get(2));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

       // Checks to see if the word "Butterfinger" is one of the values in the candyTreeMap
       // If true, will print out the word "true"
       // Note : it is case sensitive
        try {
            System.out.println("Contains 'Butterfinger': " + candyTreeMap.containsValue("Butterfinger"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Checks to see if the candTreeMap contains a key of 5 and will return true if so
        try {
            System.out.println("Contains a key of '5': " + candyTreeMap.containsKey(5));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // Checks to see if the candTreeMap contains a key of 8 and will return true if so
        // Will return false if there is not one
        try {
            System.out.println("Contains a key of '8': " + candyTreeMap.containsKey(8));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
