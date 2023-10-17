package BigONotation;

public class BigONotation {
    // Big O notation is mathematical notation that describes the limiting behaviour of a function when the argument tends toward a particular value or infinity.

    // We use Big O to describe the performance of the algorithm

    // O(n) : Big O notation
    public static void log(int [] numbers, String[] names){
        //1. Due to being accessing one element in the array as the array has the fixed number of elements hence we have to access the element in the constant fixed time called
        // *O(1)
        // Single operation running at the constant time have O(1) complexity.
        System.out.println(numbers[0]);
        System.out.println(numbers[0]); // O(1);

        // No matter how the algorithm is we see how the algorithm behaves as the
        //  input size increases;

        //2.0(n : number of items)
        // here we have the loop to mean the complexity of the algorithm will increase with the increase in the size of array linearly
        for(int number :numbers) {
            System.out.println(number);
        }


        // Special cases for example having many
        // *Single statements
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1) -> sum : O(1+1+1+1) -> 0(1) because we are searching an element in the constant time so return to O(1)

        //* more than one loop
        for(int number: numbers) {
            System.out.println(number); // O(n: input integer)
        }
        for (String name: names) {
            System.out.println(name); // O(m : input string)
        } // total complexity : O(m + n) -> 0(n : as input increases linearly)

        // *O(n^2) n : input parameters
        for(int first: numbers){
            for(int second: numbers){
                System.out.println(first + ", " + second);
            } // We are printing all combinations of numbers in the array in nested loops
        }

        // *O(n log n) :binary search
        // assume we have the array of ten numbers
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Then we have to search the number ten , starting in the middle and see if the number is smaller or larger than the element we are searching for, then taking to decision to continue left or right.
        // hence we reduced the steps required by half and making this searching quicker.


        // *02^n : exponential algorithm but it's opposite of the logarithmic
        // *Conclusion
        //1. CONSTANT O(1)
        //2. LOGARITHMIC O(logn)
        //3. LINEAR O(n)
        //4. QUADRATIC O(n^2)
        //5. EXPONENTIAL O(2^n) n: input size






    }
}
