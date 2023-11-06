package homeworkweek9darshankalathiya;

/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_07_EmptyArray {

    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> emptyArrayList = new ArrayList<>();

        // Create an ArrayList with elements
        ArrayList<String> nonEmptyArrayList = new ArrayList<>();
        nonEmptyArrayList.add("Apple");
        nonEmptyArrayList.add("Banana");

        // Check if the ArrayLists are empty
        boolean isEmpty1 = emptyArrayList.isEmpty();
        boolean isEmpty2 = nonEmptyArrayList.isEmpty();

        System.out.println("Is emptyArrayList empty? " + isEmpty1);
        System.out.println("Is nonEmptyArrayList empty? " + isEmpty2);
    }
}
