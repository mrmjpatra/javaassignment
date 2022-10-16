import java.util.Scanner;

/*Sum of product of consecutive digits of any digit number */
public class Assignment1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem,prod=1;
        System.out.println("Enter a number ");
        num=sc.nextInt();

        while (num>0) {
            rem=num%10;
            prod*=rem;
            num/=10;
        }
        System.out.println("Product of consecutive digit is :: "+prod);

    }
}
