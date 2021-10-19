import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // insertion sort
        InsertionSorter insertionSorter = new InsertionSorter();
        insertionSorter.printSortName();
        insertionSorter.arrayBefore();
        insertionSorter.arraySorted();

        // selection sort
        SelectionSorter selectionSorter = new SelectionSorter();
        selectionSorter.printSortName();
        selectionSorter.arrayBefore();
        selectionSorter.arraySorted();

        // bubble sort
        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.printSortName();
        bubbleSorter.arrayBefore();
        bubbleSorter.arraySorted();
    }
}
