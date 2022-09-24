/*
Difference between average of all even digits except divisible by 4 and
avearge of all odd digits except divisble by 3 of any 4 digit number
*/

public class Assignment6_3 {
    public static void main(String[] args) {
        int num=1334;
        int sum1=0,sum2=0,rem=0;

        rem=num%10;
        sum1+=(rem%2==0?(rem%4!=0?rem:0):0);
        sum2+=(rem%2!=0?rem:0);
        rem=0;
        num=num/10;
       


        rem=num%10;
        sum1+=(rem%2==0?(rem%4!=0?rem:0):0);
        sum2+=(rem%2!=0?rem:0);
        rem=0;
        num=num/10;
       

        rem=num%10;
        sum1+=(rem%2==0?(rem%4!=0?rem:0):0);
        sum2+=(rem%2!=0?rem:0);
        rem=0;
        num=num/10;
       

        rem=num%10;
        sum1+=(rem%2==0?(rem%4!=0?rem:0):0);
        sum2+=(rem%2!=0?rem:0);
        rem=0;
        num=num/10;

       
        System.out.println("The difference tween average of all even digits except divisible by 4 and avearge of all odd digits except divisble by 3 of any 4 digit number is : "+(sum1-sum2));
    }
}
