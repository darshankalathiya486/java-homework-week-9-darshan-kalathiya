package homeworkweek9darshankalathiya;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Programme_09_HashMap {

    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();

        // Add some key-value pairs to the map
        people.put("Alice", 25);
        people.put("Bob", 30);
        people.put("Charlie", 35);

        // Use a for-each loop to iterate through the values in the map
        System.out.println("Ages of People:");
        for (Integer age : people.values()) {
            System.out.println(age);
        }
    }
}
