/*Find left shit, right shift and zero fill of summation of all digits of any
4 digit number and it will be shifted by 3rd digit of any 4 digit
number? */

public class Assignment5_7 {
    public static void main(String[] args) {

        int num, sum, d1, d2, d3, d4;
        num = 9728;

        d1 = num / 1000;
        d2 = num / 100 % 10;
        d3 = num / 10 % 10;
        d4 = num % 10;

        sum = d1 + d2 + d3 + d4;

        System.out.println("The number is: " + num);
        System.out.println("The Sum of the digits is: " + sum);
        System.out.println("Left shift upto " + d3 + " to sum is: " + (sum << d3));
        System.out.println("Right shift upto " + d3 + " to sum is: " + (sum >> d3));
        System.out.println("Right shift and zero fill upto " + d3 + " to sum is: " + (sum >>> d3));

        

    }
}
