/*
Write a program to search for a user defined number in array of 20 numbers using linear search and binary search using class and object? Allow user to choose searching method. */

class Search {
    public boolean linearSearch(int[] arr,int target){
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
               found=true;
            }
        }
        return found;
    }

    public boolean binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==target) {
                return true;
            }

            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}

public class Assignment8{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Search search=new Search();

        // System.out.println(search.linearSearch(arr, 10));
        System.out.println(search.binarySearch(arr, 8));
    }
}