package homeworkweek9darshankalathiya;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_03_ReverseArray {

    public static void main(String[] args) {
        int[] originalNumbers = {1, 2, 3, 4, 5};

        System.out.println("Original Numbers:");
        printNumbers(originalNumbers);

        int[] reversedNumbers = reverseIntArray(originalNumbers);

        System.out.println("\nReversed Numbers:");
        printNumbers(reversedNumbers);
    }

    public static int[] reverseIntArray(int[] numbers) {
        int length = numbers.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = numbers[length - 1 - i];
        }

        return reversed;
    }

    public static void printNumbers(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}
