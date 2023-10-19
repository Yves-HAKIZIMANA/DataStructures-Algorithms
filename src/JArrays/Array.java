package JArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array {
    private int[] numbers;
    private int count;
    public Array(int length){
        this.numbers = new int[length];
    }

    public void insert(int item){
        // If the array is full
        if(count == numbers.length){
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];
            // Copy the existing items
            for(int i = 0; i < count; i++){
                newItems[i] = numbers[i];
            }
            numbers = newItems;
        }
        numbers[count++] = item;
    }

    public void removeAt(int index){
        // Validate the range
        if(index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid index provided.");
        // Shift the items to the left to fill the hole
        for(int i = index; i < count - 1; i++){
            numbers[i] = numbers[i+1];
        }
        // Decrement the count variable as the element is being shifted
        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(item == numbers[i])
                return i;
        }
        return -1;
    }

    public int max(){
        int max = 0;
        for(int i = 0; i < count; i++){
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    public void reverse(){
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        for(int nbr : numbers){
            System.out.println(nbr);
        }
    }

    public void insertAt(int item, int index){
        // we must validate the index
        if(index < 0 || index >= numbers.length)
            throw new IllegalArgumentException("Index out of bound");

        int[] newArray = new int[count + 1];
        for(int i = 0; i< index; i++){
            newArray[i] = numbers[i];
        }
        newArray[index] = item;
        for(int i = index + 1; i < count ; i++){
            newArray[i] = numbers[i];
        }
        numbers = newArray;

    }

    public void intersect(int[] newArray){
        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int i = 0; i < count; i++){
            uniqueElements.add(numbers[i]);
        }

        for(int i = 0; i < newArray.length; i++){
            // first we have to check if we have the element in the set
            if(uniqueElements.contains(newArray[i]))
                // Then we print to the console
                System.out.println(newArray[i]);
        }

    }
    public void print(){
        for(int nbr : numbers){
            System.out.println(nbr);
        }
    }

}

