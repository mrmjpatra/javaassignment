import java.util.Scanner;

/*Write a java program to find sum of product of corresponding even digits of 
first any digit number and corresponding odd digit of any digit number Such 
as n=1234 m=4567 output=4*7+2*5 */
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, sum = 0, prod = 1, rem1, rem2;
        System.out.println("Enter the first number (m)");
        m = sc.nextInt();
        System.out.println("Enter the second number (n)");
        n = sc.nextInt();

        while (m > 0 && n > 0) {
            rem1 = m % 10;
            rem2 = n % 10;
            if ((rem1 % 2 == 0 && rem2 % 2 != 0) ) {
                sum += (rem1 * rem2);
            }
            m /= 10;
            n /= 10;
        }
        System.out.println("Sum of product of corresponding digits even digits of first any digit number and corresponding odd digit of any digit number is " + sum);
    }
}
