package homeworkweek9darshankalathiya;

import java.util.ArrayList;

/**
 *  Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11_CompareArraylist {

    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the ArrayLists
        boolean areEqual = c1.equals(c2); // Using the equals() method

        if (areEqual) {
            System.out.println("c1 and c2 are equal.");
        } else {
            System.out.println("c1 and c2 are not equal.");
        }

        // Alternatively, you can manually compare the ArrayLists
        boolean manuallyEqual = areArrayListsEqual(c1, c2);

        if (manuallyEqual) {
            System.out.println("Manually compared: c1 and c2 are equal.");
        } else {
            System.out.println("Manually compared: c1 and c2 are not equal.");
        }
    }

    public static boolean areArrayListsEqual(ArrayList<String> list1, ArrayList<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (String item : list1) {
            if (!list2.contains(item)) {
                return false;
            }
        }

        return true;
    }


}
