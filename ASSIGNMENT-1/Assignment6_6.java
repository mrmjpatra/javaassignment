/*Difference between Sum of product of consecutive even digits except 2
and 6 and Sum of product of consecutive odd digits except 3 and 7 of any 4 digit number */
public class Assignment6_6 {
    public static void main(String[] args) {
        int num=1122;
        int rem=0,a1,b1,c1,d1,a2,b2,c2,d2;

        rem=num%10;
        a1=((rem%2==0)?(rem!=2 && rem!=6?rem:0):0);
        a2=rem%2!=0?(rem!=3 && rem!=7?rem:0):0;
        num/=10;
        rem=0;
       
        
        rem=num%10;
        b1=((rem%2==0)?(rem!=2 && rem!=6?rem:0):0);
        b2=rem%2!=0?(rem!=3 && rem!=7?rem:0):0;
        num/=10;
        rem=0;
        
        
        rem=num%10;
        c1=((rem%2==0)?(rem!=2 && rem!=6?rem:0):0);
        c2=rem%2!=0?(rem!=3 && rem!=7?rem:0):0;
        num/=10;
        rem=0;
       
        
        rem=num%10;
        d1=((rem%2==0)?(rem!=2 && rem!=6?rem:0):0);
        d2=rem%2!=0?(rem!=3 && rem!=7?rem:0):0;
        num/=10;
        rem=0;
       
        

        int sum1=0,sum2=0;

        sum1+=(a1!=0 && b1!=0)?(a1*b1):0; 
        sum1+=(b1!=0 && c1!=0)?(b1*c1):0; 
        sum1+=(c1!=0 && d1!=0)?(c1*d1):0; 


        sum2+=(a2!=0 && b2!=0)?(a2*b2):0; 
        sum2+=(b2!=0 && c2!=0)?(b2*c2):0; 
        sum2+=(c2!=0 && d2!=0)?(c2*d2):0; 

       System.out.println("Difference between Sum of product of consecutive even digits except 2and 6 and Sum of product of consecutive odd digits except 3 and 7 of any  4 digit number  : "+(sum1-sum2));


    }
}
