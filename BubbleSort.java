import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unSortedArray = {5, 3, 1, 4, 2};
        System.out.println("Array before sorting : "+ Arrays.toString(unSortedArray));
        int[] sortedArray = BubbleSort.bubbleSort(unSortedArray);
        System.out.println("Arrays after Sorting : " + Arrays.toString(sortedArray));

    }
    public static int[] bubbleSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length -1 ; i ++){
            for (int j = 0; j < length -i -1  ; j ++){
                if (array[j] >  array[j +1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}

