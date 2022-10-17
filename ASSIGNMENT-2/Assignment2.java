import java.util.Scanner;

/*Write a java program to find sum of product of corresponding digits of two 
any digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1 */
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, sum = 0, rem1, rem2;
        System.out.println("Enter the first number (m)");
        m = sc.nextInt();
        System.out.println("Enter the second number (n)");
        n = sc.nextInt();

        while (m > 0 && n > 0) {
            rem1 = m % 10;
            rem2 = n % 10;
            sum+=(rem1*rem2);
            m/=10;
            n/=10;
        }
        System.out.println("Sum of product of corresponding digits of two any digit number is "+sum);

    }
}