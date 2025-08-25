import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unSortedArray = {3, 4, 5, 1, 2};
        System.out.println("Array before sorting "+ Arrays.toString(unSortedArray));
        int[] sortedArray = SelectionSort.selectionSort(unSortedArray);
        System.out.println("Array after sorting "+Arrays.toString(sortedArray));
    }

    public static int[] selectionSort(int[] array){

        int length = array.length;
        for (int i = 0; i < length - 1 ; i ++){
            int maxIndex = 0;
            for (int j = 1 ; j < length - i; j ++){
               if (array[j] >  array[maxIndex]){
                   maxIndex = j;

               }
            }
            // swap the array[maxIndex] with array[length - 1 - i]
            int temp = array[length-1-i];
            array[length-1-i] = array[maxIndex] ;
            array[maxIndex]  = temp;

        }
        return array;
    }
}

// Outer loop: runs from 0 to n-1 (each pass places one element at its correct position)
// Inner loop: start from 1 (since we assume 0th index is the max initially) up to length - i - 1
// Purpose: find the index of the maximum element in the unsorted part
// After finding max, swap it with the element at index (length - 1 - i)
// This places the maximum element at the end of the unsorted part
// Best case TC , Avg case TC and WOrst case TC - O(n^2)
