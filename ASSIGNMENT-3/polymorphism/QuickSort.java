package polymorphism;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 10, 5, 9, 2, 1,15,7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int lb, int ub) {
        int loc;
        if (lb < ub) {
            loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    private static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb+1;
        for (int i = lb+1; i <=ub; i++) {
            System.out.println(arr[i]);
            if (arr[i]<pivot) {
                swap(arr, start, i);
                start++;
            }
        }
        swap(arr, lb, start-1);
        return start-1;
    }

    private static void swap(int[] arr, int start, int end) {
        System.out.println(arr[start]+" --> "+arr[end]);
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
