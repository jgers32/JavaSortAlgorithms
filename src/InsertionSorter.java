import java.util.Arrays;

public class InsertionSorter implements Sorter {

    // function below takes a passed-in array
    // sorts the values in ascending order
    // this is the insertion sort algorithm method

    // implement sorterTest class to get random array to be sorted
    SorterTest sorterTest = new SorterTest();
    int[] insertArray = sorterTest.getRandomArray();

    public int[] InsertionSorter() {
        // outer loop: runs while going through the length of the list
        for (int index = 1; index < insertArray.length; index++) {

            // int to store the position
            int position;

            // int to hold the current value
            int hold = insertArray[index];


            // inner loop: determines if insertion should happen here or not
            for (position = index; position > 0; position--) {
                if (insertArray[position - 1] < hold)
                    break;

                // moves the correct sorted position over
                insertArray[position] = insertArray[position - 1];
            }

            // inserts the value into the correct and sorted index
            insertArray[position] = hold;

            System.out.println("(step "+ (index)+"): " + Arrays.toString(insertArray));
        }
        return insertArray;
   }

    // overriding methods from Sorter interface

    @Override
    public void printSortName() {
        System.out.println("=== INSERTION SORT ===");
    }

    @Override
    public void arrayBefore() {
        System.out.println("testArray1 (before): "+ Arrays.toString(insertArray));
    }

    @Override
    public void arraySorted() {
        System.out.println("testArray1 (after): "+ Arrays.toString(InsertionSorter())+"\n");
    }
}