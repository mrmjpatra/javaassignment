package Array;
import java.util.Arrays;

/*Write a program to sort 10 numbers in descending order and average of 3rd largest and 4th smallest number in an array of 10 user defined numbers? */
public class Assignment4 {
    public static void main(String[] args) {
        int []arr={5,1,3,6,2,9,8,10,7,4};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The average of 3rd largest and 4th smallest number in an array of 10 number is ::"+((arr[7]+arr[3])/2));
    }
}
