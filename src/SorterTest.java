import java.util.Random;

public class SorterTest {

    // method to generate an array -- each array element is a random int
    private int[] setRandomArray() {
        Random random = new Random();
        // creates a random array with 8 values (like the assignment example output array's)
        int[] randomArr = new int[8];
        for( int i = 0; i< 8; i++){
            // sets the bounds of the random to be less than 10 -- between 1 and 9
            randomArr[i] = random.nextInt(8)+1;
        }
        return randomArr;
    }

    // creates the random array by calling the set method above
    public int[] randomArray = setRandomArray();

    // get method to pass this random array to other classes when implemented
    public int[] getRandomArray(){
        return randomArray;
    }
}