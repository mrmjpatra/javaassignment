package polymorphism;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3, 5, 9, 8 };
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }
    public static void merge(int[] array, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= high) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            temp[k] = array[i];
            k++;
            i++;
        }
        while (j <= high) {
            temp[k] = array[j];
            k++;
            j++;
        }
        for (int l = 0; l < temp.length; l++) {
            array[low + l] = temp[l];
        }
    }
}
