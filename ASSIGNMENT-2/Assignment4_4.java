import java.util.Scanner;

/*x-x3/3! + x5/5!-x7/7!+x11/11!------+xn/n! */
public class Assignment4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,n,fact=1;
        double sum;
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int count=0;
        boolean check=false;
        sum=x;
        for (int i = 3; i <=n; i--) {
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
