package homeworkweek9darshankalathiya;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */


import java.util.HashMap;
import java.util.HashSet;

public class Programme_10_Stations {

    public static void main(String[] args) {
        // Create a HashMap to map stations to their corresponding lines
        HashMap<String, HashSet<String>> stationToLines = new HashMap<>();

        // Populate the HashMap with Zone 1 stations and their associated lines
        stationToLines.put("Oxford Circus", new HashSet<>());
        stationToLines.get("Oxford Circus").add("Bakerloo");
        stationToLines.get("Oxford Circus").add("Victoria");
        stationToLines.get("Oxford Circus").add("Central");

        stationToLines.put("Piccadilly Circus", new HashSet<>());
        stationToLines.get("Piccadilly Circus").add("Bakerloo");
        stationToLines.get("Piccadilly Circus").add("Piccadilly");

        stationToLines.put("Waterloo", new HashSet<>());
        stationToLines.get("Waterloo").add("Bakerloo");
        stationToLines.get("Waterloo").add("Jubilee");
        stationToLines.get("Waterloo").add("Northern");

        // Specify the station for which you want to find the lines
        String targetStation = "Oxford Circus";

        if (stationToLines.containsKey(targetStation)) {
            System.out.println("Lines passing through " + targetStation + ":");
            for (String line : stationToLines.get(targetStation)) {
                System.out.println(line);
            }
        } else {
            System.out.println(targetStation + " is not in Zone 1.");
        }
    }
}
