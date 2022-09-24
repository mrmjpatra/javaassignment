/*
Sum of product of consecutive odd digits of any 4 digit number? Supoose
num=1356 then output= 5*3+ 3*1
 */

public class Assignment6_5 {
    public static void main(String[] args) {

        int num=1356;
        int a=0,b=0,c=0,d=0,rem=0;

        rem=num%10;
        a=rem%2!=0?rem:0;
        num/=10;
        rem=0;
      

        rem=num%10;
        b=rem%2!=0?rem:0;
        num/=10;
        rem=0;
       

        rem=num%10;
        c=rem%2!=0?rem:0;
        num/=10;
        rem=0;
       
        rem=num%10;
        d=rem%2!=0?rem:0;
        num/=10;
        rem=0;

        int sum=0;

        sum+=((a!=0 && b!=0)?(a*b):0);
        sum+=((b!=0 && c!=0)?(b*c):0);
        sum+=((c!=0 && d!=0)?(c*d):0);


        System.out.println("Sum of product of consecutive odd digits of any 4 digit number? Supoose num=1356"+sum);
        
    }
}
