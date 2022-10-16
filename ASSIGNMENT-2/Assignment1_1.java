import java.util.Scanner;

/*Sum of all digits of any numbers */

public class Assignment1_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem,sum=0;
        System.out.println("Enter the number");
        num=sc.nextInt();
        while (num>0) {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("The sum of the digit is :: "+sum);
    }
}