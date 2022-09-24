/*Sum of product of consecutive digits of any 4 digit number? Supoose num=1234 then output= 4*3+3*2+2*1 */

public class Assignment5_4 {
    public static void main(String[] args) {
        int num=6198;
        int a,b,c,d,ans=0;

        a=num%10;
        num/=10;

        b=num%10;
        num/=10;
        
        c=num%10;
        num/=10;
       
        d=num%10;
        num/=10;


        ans=(a*b)+(b*c)+(c*d);
        System.out.println("Sum of product of consecutive digits is : "+ans);

       
    }
}
