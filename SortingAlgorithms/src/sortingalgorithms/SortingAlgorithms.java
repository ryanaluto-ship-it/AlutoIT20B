
package sortingalgorithms;
    
import java.util.Arrays;

public class SortingAlgorithms {

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    // Main Method
    public static void main(String[] args) {

        int[] originalArray = {
            45, 12, 89, 23, 7, 56, 34, 90, 18, 3
        };

        // Separate copies of the original array
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(originalArray));

        // Bubble Sort
        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort:");
        System.out.println(Arrays.toString(bubbleArray));

        // Selection Sort
        selectionSort(selectionArray);
        System.out.println("\nSelection Sort:");
        System.out.println(Arrays.toString(selectionArray));

        // Insertion Sort
        insertionSort(insertionArray);
        System.out.println("\nInsertion Sort:");
        System.out.println(Arrays.toString(insertionArray));
    }

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

