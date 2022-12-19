package Array;
import java.util.Arrays;

/*Write a program to sort 10 numbers in ascending order and find the sum of product of 2nd smallest and 3rd largest number? */
public class Assignment3 {
    public static void main(String[] args) {
        int []arr={5,1,3,6,2,9,8,10,7,4};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        sum=arr[1]+arr[7];

        System.out.println("The sum of 2nd smallest and third larges number is :: "+sum);
    }
}
