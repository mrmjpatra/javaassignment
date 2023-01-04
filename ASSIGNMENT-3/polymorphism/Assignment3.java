/*Write a program to sort 10 numbers in the array using following sorting algorithm and method overloading?
a) merge sort
b) quick sort 
c) heap sort */
package polymorphism;

import java.util.Arrays;

class SortintAlgo {

    public void sort(int[] arr, int a) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, float a) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, double a) {

        int N = arr.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);

        }

    }

    private void heapify(int[] arr, int N, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private void merge(int[] array, int low, int middle, int high) {
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

    private void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    private int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb + 1;
        for (int i = lb + 1; i <= ub; i++) {
            if (arr[i] < pivot) {
                swap(arr, start, i);
                start++;
            }
        }
        swap(arr, lb, start - 1);
        return start - 1;
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}

public class Assignment3 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3, 5, 9, 8 };
        SortintAlgo sAlgo = new SortintAlgo();
        // sAlgo.sort(arr, 0);
        sAlgo.sort(arr, 2.0);
        System.out.println(Arrays.toString(arr));
    }
}
