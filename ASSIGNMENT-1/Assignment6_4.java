/*
Sum of product of consecutive even digits of any 4 digit number? Supoose
num=1624 then output= 4*2+2*6
 */
public class Assignment6_4 {
    public static void main(String[] args) {
        int num=1624;
        int a=0,b=0,c=0,d=0,rem=0;

        rem=num%10;
        a=rem%2==0?rem:0;
        num/=10;
        rem=0;
      

        rem=num%10;
        b=rem%2==0?rem:0;
        num/=10;
        rem=0;
       

        rem=num%10;
        c=rem%2==0?rem:0;
        num/=10;
        rem=0;
       
        rem=num%10;
        d=rem%2==0?rem:0;
        num/=10;
        rem=0;

       int sum=0;

        sum+=((a!=0 && b!=0)?(a*b):0);
        sum+=((b!=0 && c!=0)?(b*c):0);
        sum+=((c!=0 && d!=0)?(c*d):0);


        System.out.println("Sum of product of consecutive even digits of any 4 digit number? Supoosenum=1624"+sum);

    }
}
