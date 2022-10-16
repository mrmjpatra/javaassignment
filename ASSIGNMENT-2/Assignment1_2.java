import java.util.Scanner;

/*Sum of all even digits of any number */
public class Assignment1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem,sum=0;
        System.out.println("Enter  the number ");
        num=sc.nextInt();
        while(num>0){
            rem=num%10;
            if (rem%2==0) {
                sum+=rem;
            }
            num/=10;
        }
        System.out.println("Sum of even digit is :: "+sum);
    }
}
