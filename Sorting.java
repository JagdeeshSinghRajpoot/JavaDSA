import java.util.Collections;
import java.util.*;
public class Sorting {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minmum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minmum] > arr[j]) {
                    minmum = j;
                }
            }
            int temp = arr[minmum];
            arr[minmum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(Integer arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr ;
        }
    }

    public static int compare(int a, int b){
        // a < b -ve
        // a == b 0
        // a > b +ve
        return a - b;
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for(int i = 0;i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 5, 2 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

        // inbuilt sort
        // Arrays.sort(arr);
    
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,2,Collections.reverseOrder());
        countingSort(arr);
        
        printArr(arr);

        
    }

}
