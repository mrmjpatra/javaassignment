import java.util.Scanner;

/*Sum of all prime digits */
public class Assignment1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem,sum=0,count=0;
        System.out.println("Enter the number ");
        num=sc.nextInt();

        while (num>0) {
            rem=num%10;
            for(int i=1;i<=rem;i++){
                if (rem%i==0) {
                    count++;
                }
            }
            if (count==2) {
                sum+=rem;
            }
            count=0;
            num/=10;
        }

        System.out.println("The sum of prime digit is :: "+sum);

    }
}
