import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unSortedArray = {5, 3, 1, 4, 2};
        System.out.println("Array before sorting : "+ Arrays.toString(unSortedArray));
        int[] sortedArray = InsertionSort.insertionSort(unSortedArray);
        System.out.println("Arrays after Sorting : " + Arrays.toString(sortedArray));
    }
    public static int[] insertionSort(int[] array){
        for (int i = 0; i < array.length - 1; i ++){
            for (int j = i +1; j > 0 ; j --){
                if (array[j] < array[j-1]){
                    swap(array,j , j -1);
                }
                else{
                    break;
                }

            }
        }
        return array;
    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//Best Case: O(n)
//
//Worst Case: O(n²)
//
//Average Case: O(n²)
