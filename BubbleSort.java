import java.util.Arrays;
import java.util.Random;

/**
 * This is the package for BubbleSort.java
 *
 * The BubbleSort program makes a random array.
 * it displays an array of 10 integers,
 * displays the array in numerical order,
 * using bubble sort.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @version 1.0
 * @since 2025-03-18
 */

public final class BubbleSort {

    /**
     * The size of the array to be populated. */
    private static final int ARRAYSIZE = 10;

    /**
     * This method sorts an array using the bubble sort algorithm.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] bubbleSort(final int[] array) {
        // Bubble sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; 
                }
            }
        }
        return array;
    }
    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(final String[] args) {
        Random rand = new Random();
        int[] arrayOfInts = new int[ARRAYSIZE];
        int[] sortedArray = new int[ARRAYSIZE];


        // populate array with random numbers
        for (int i = 0; i < ARRAYSIZE; i++) {
            arrayOfInts[i] = rand.nextInt(100);
        }

        // print array to console
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arrayOfInts));

        // Call Bubble sort function
        sortedArray = bubbleSort(arrayOfInts);

        // print sorted array to console
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));

    }
}
