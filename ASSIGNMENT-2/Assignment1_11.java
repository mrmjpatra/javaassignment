import java.util.Scanner;

/*Difference between Sum of product of consecutive even digits except 2 and 6 and Sum of product of consecutive odd digits except 3 and 7 of any digit number */
public class Assignment1_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem1,rem2,sum1=0,sum2=0;
        System.out.println("Enter the number");
        num=sc.nextInt();
        while (num>0) {
            rem1=num%10;
            rem2=(num/10)%10;
            if ((rem1%2==0 && rem2%2==0) && (rem1!=2 && rem1!=6) && (rem2!=2 && rem2!=6)) {
                sum1+=rem1*rem2;
            }else if ((rem1%2!=0  && rem2%2!=0 )&& (rem1!=3 && rem1!=7) && (rem2!=3 && rem2!=7)) {
                sum2+=rem1*rem2;
            }
            num/=10;
        }

        System.out.println("Sum of even digit is "+sum1);
        System.out.println("Sum of odd digit is "+sum2);
    }
}
