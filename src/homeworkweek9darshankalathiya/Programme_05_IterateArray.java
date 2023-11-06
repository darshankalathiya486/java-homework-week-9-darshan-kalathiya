package homeworkweek9darshankalathiya;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */



import java.util.ArrayList;
import java.util.Iterator;

public class Programme_05_IterateArray {

    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Create an Iterator for the ArrayList
        Iterator<String> iterator = arrayList.iterator();

        // Iterate through the ArrayList using the Iterator
        System.out.println("Elements in the ArrayList:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
