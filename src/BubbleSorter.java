import java.util.Arrays;

public class BubbleSorter implements Sorter {
    // function that can take a passed-in array
    // sort in ascending order
    // bubble sort algorithm

    // implement sorterTest class to get random array to be sorted
    SorterTest sorterTest = new SorterTest();
    int[] bubbleArray = sorterTest.getRandomArray();

    public int[] BubbleSorter() {

        // outer loop: loops through the array
        for (int i = 0; i < bubbleArray.length - 1; i++) {

            // create int to hold the value if we need to make the swap
            int hold;

            // inner loop: completes the swaps if the values need to get changed
            for (int j = 0; j < bubbleArray.length - 1; j++) {
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    // gives hold the value we need it to store
                    hold = bubbleArray[j];
                    // moves the value we need to move to the left
                    bubbleArray[j] = bubbleArray[j + 1];
                    // swaps the value from hold to the right
                    bubbleArray[j + 1] = hold;
                    // swap is complete
                }
            }
            System.out.println("(step "+ (i+1)+"): " + Arrays.toString(bubbleArray));
        }
        return bubbleArray;
    }

    // overriding methods from Sorter interface

    @Override
    public void printSortName() {
        System.out.println("=== BUBBLE SORT ===");
    }

    @Override
    public void arrayBefore() {
        System.out.println("testArray3 (before): " + Arrays.toString(bubbleArray));
    }

    @Override
    public void arraySorted() {
        System.out.println("testArray3 (after): "+ Arrays.toString(BubbleSorter()));
    }
}