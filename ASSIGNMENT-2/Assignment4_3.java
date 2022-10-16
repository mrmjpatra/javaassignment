import java.util.Scanner;

/*1+x2/2! + x4/4!+x6/6!+------+xn/n! */
public class Assignment4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, fact = 1, count = 0;
        double sum = 1;
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(int i=n;i>=2;i=i-2){
            for (int j = 1; j <=i; j++) {
                fact=fact*i;
            }

            sum+=Math.pow(x, i)/fact;
            fact=1;
        }
        System.out.println(sum);
    }
}
