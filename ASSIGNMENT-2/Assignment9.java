import java.util.Scanner;

/*Write a program to find factorial of difference between greatest and smallest number among 3 numbers? */
public class Assignment9 {
    public static void main(String[] args) {
        int num,n1,n2,n3,fact=1,largest,smallest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

       largest=(n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
       smallest=(n1<n2)?(n1<n3)?n1:n3:(n2<n3)?n2:n3;
        num=largest-smallest;
        for (int i = 1; i <=num; i++) {
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is :: "+fact);

    }
}
