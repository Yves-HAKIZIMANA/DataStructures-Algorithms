package JArrays;

import java.sql.Array;
import java.util.Arrays;

public class JavaArray {
    // Arrays in Java are either fixed so accessing elements within it is so easy, then
    // And that is easy done O(1) complexity to mean in constant time
    // It is the data structure that is used to store elements in linear elements


    // *** weaknesses;
    // 1.The array is fixed

    // *** Operations
    //1. lookup O(1)
    //2. insert 0(n)
    //3. remove, -> lastLement O(1), bestcase -> O(n)
    public static  void arrayjava(){
        int[] numbers = {10, 20, 30};
        System.out.println(numbers.length); // this returns the number of elements in  the array
        System.out.println(Arrays.toString(numbers)); // Printing the elements of the array

    }


}
