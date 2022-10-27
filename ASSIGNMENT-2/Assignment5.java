import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,n=0,num,fact=1,rem,count=0;
        double sum;
        System.out.println("Enter the number ");
        num=sc.nextInt();
        while (num>0) {
            rem=num%10;
            if (rem%2==0 && rem!=2 && rem!=8) {
               x+=rem;
            }else if(rem%2!=0 && rem!=1 && rem!=3){
                n+=rem;
            }
            num/=10;
        }

        sum=x;
        boolean check=false;
        for (int i = 3; i<=n; i--) {
            count=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            
            if (count==2) {
                for(int k=1;k<=i;k++){
                    fact=fact*k;
                }
                if (check) {
                    sum+=Math.pow(x, i)/fact;
                    fact=1;
                    check=false;
                }else {
                    sum-=Math.pow(x, i)/fact;
                    fact=1;
                    check=true;
                }                
            }
        }

        System.out.println(sum);
    

    }
}
