package org.example.datastructures;


/**
 * Array is a container which can hold fix number of items and these items should be of same type.
 */
public class ArrayDS {
    public static void main(String[] args) {
        // Declare Array
        int array[];

        // Initialize array of 8 int
        array = new int[8];

        // display array with default int values
        display(array);

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // display array with added values
        display(array);

        // Operation : Insertion
        // Element at any location can be updated directly
        int index = 5;
        array[index] = 10;

        // Operation : Search using value
        // Search an element using value.
        int value = 4;
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] == value ){
                System.out.println(value + " Found at index "+i);
                break;
            }
        }
    }

    private static void display(int[] array) {
        System.out.print("Array: [");
        for(int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println(" ]");
    }
}
