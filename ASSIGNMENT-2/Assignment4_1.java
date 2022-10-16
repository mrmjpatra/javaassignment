import java.util.Scanner;

/*Write a java program to compute following series and take input x and n
I. 1-x2/2! + x3/3!-x4/4!+------+xn/n! */
public class Assignment4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,n,fact=1;
        double sum=1;
        System.out.println("Enter the value of x ");
        x=sc.nextInt();
        System.out.println("Enter the value of n ");
        n=sc.nextInt();

        for (int i = n; i >1; i--) {
            for (int j = 1; j <=i; j++) {
                fact*=j;
            }
            if (i%2==0) {
               sum=sum-(Math.pow(x, i)/fact);
               fact=1; 
            }else if(i%2!=0){
                sum=sum+(Math.pow(x, i)/fact);
                fact=1;
            }
        }
        System.out.println(sum);

    }
}
