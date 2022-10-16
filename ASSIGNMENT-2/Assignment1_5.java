import java.util.Scanner;

/*Difference between average of all even digits except divisible by
4 and average of all odd digits except divisible by 3  */

public class Assignment1_5 {
    public static void main(String[] args) {
        int num,rem,sum1=0,sum2=0,count1=0,count2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        while (num>0) {
            rem=num%10;
            if (rem%2==0 && rem%4!=0) {
                sum1+=rem;
                count1++;
            }else if (rem%2!=0 && rem%3!=0) {
                sum2+=rem;
                count2++;
            }
            num/=10;
        }

        System.out.println("Difference is :: "+((sum1/count1)-(sum2/count2)));

    }
}
