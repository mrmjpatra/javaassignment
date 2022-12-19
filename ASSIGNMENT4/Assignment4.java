import java.util.Arrays;

/*WAP to find repeated elements and no of repeated elements in the array of 20 user defined values and also remove redundant values and update array with unique values only using simple inheitence? */

public class Assignment4 {
    public static void main(String[] args) {
        int count = 0, k = 0;
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 6, 7 };
        String repeat="";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        repeat+=(arr[j]+"");
                        arr[j] = -1;
                    }
                }
            }
        }
        System.out.println("The elements who are repeated : "+Arrays.toString(repeat.toCharArray()));
        System.out.println("The number of repeated element :: "+repeat.length());

    }
}
