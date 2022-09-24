import java.util.Scanner;

/*Write a java program to find following without using looping and decision
making
Sum of all digits of any 4 digit numbers */
public class Assignment5_1 {
    public static void main(String[] args) {

        int num = 1624;
        int sum = 0, rem;

        rem = num % 10;
        sum += rem;
        rem = 0;
        num = num / 10;

        rem = num % 10;
        sum += rem;
        rem = 0;
        num = num / 10;

        rem = num % 10;
        sum += rem;
        rem = 0;
        num = num / 10;

        rem = num % 10;
        sum += rem;
        rem = 0;
        num = num / 10;

        System.out.println(sum);

    }
}
