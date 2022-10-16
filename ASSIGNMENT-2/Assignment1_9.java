import java.util.Scanner;

/*Sum of product of consecutive odd digits of any digit number */
public class Assignment1_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem1,rem2,sum=0;

        System.out.println("Enter the number");
        num=sc.nextInt();
        while (num>0) {
            rem1=num%10;
            rem2=(num/10)%10;
            if (rem1%2!=0 && rem2%2!=0) {
                sum+=rem1*rem2;
            }
            num/=10;
        }
        System.out.println("Sum of product of consecutive odd digits of any digit number :: "+sum);
    }
}
