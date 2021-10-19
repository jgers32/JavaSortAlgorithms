import java.util.Arrays;

public class SelectionSorter implements Sorter {
    // function that can take a passed-in array
    // sort in ascending order
    // selection sort algorithm

    // implement sorterTest class to get random array to be sorted
    SorterTest sorterTest = new SorterTest();
    int[] selectionArray = sorterTest.getRandomArray();

    public int[] SelectionSorter() {

        // outer loop: loops through the array
        for (int i = 0; i < selectionArray.length - 1; i++) {
            // the minimum value in the list will get assigned to this
            int minimum = i;

            // if we need to insert, we will let this int hold the value while we do so
            int hold = 0;

            // inner loop:
            for (int j = i + 1; j < selectionArray.length; j++) {
                // looks to see if it needs to reset the minimum value
                if (selectionArray[j] < selectionArray[minimum]) {
                    minimum = j;
                }
            }
            // stores the minimum value of the list in hold variable
            hold = selectionArray[minimum];
            // goes to the place where min should go (based on the index we are at)
            selectionArray[minimum] = selectionArray[i];
            // places the minimum value in its correctly sorted place
            selectionArray[i] = hold;

            System.out.println("(step "+ (i+1)+"): " + Arrays.toString(selectionArray));
        }
        return selectionArray;

    }

    // overriding methods from Sorter interface

    @Override
    public void printSortName() {
        System.out.println("=== SELECTION SORT ===");
    }

    @Override
    public void arrayBefore() {
        System.out.println("testArray2 (before): "+ Arrays.toString(selectionArray));
    }

    @Override
    public void arraySorted() {
        System.out.println("testArray2 (after): "+Arrays.toString(SelectionSorter())+"\n");
    }
}
