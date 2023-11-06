package homeworkweek9darshankalathiya;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Programme_06_RetrieveArray {

    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Specify the index of the element to retrieve
        int indexToRetrieve = 1; // Index 2 corresponds to the element "Cherry"

        // Check if the specified index is within the valid range
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            // Retrieve the element at the specified index
            String element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid index specified.");
        }
    }
}
