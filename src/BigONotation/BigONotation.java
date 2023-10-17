package BigONotation;

public class BigONotation {
    // Big O notation is mathematical notation that describes the limiting behaviour of a function when the argument tends toward a particular value or infinity.

    // We use Big O to describe the performance of the algorithm

    // O(n) : Big O notation
    public static void log(int [] numbers){
        // Due to being accessing one element in the array as the array has the fixed number of elements hence we have to access the element in the constant fixed time called *O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]); // O(1);

        // No matter how the algorithm is we see how the algorithm behaves as the
        //  input size increases;



    }
}
