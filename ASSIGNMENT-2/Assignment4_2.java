import java.util.Scanner;

/*.Write a java program to compute following series and take input x and n
    x-x3/3! + x5/5!-x7/7!+------+xn/n!
 */
public class Assignment4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, fact = 1;
        boolean check=false;
        double sum = 0;
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        sum = x;
        for (int i = 3; i <= n; i =i+2) {
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
           
            if (check) {
                sum += Math.pow(x, i) / fact;
                check=false;
            } else  {
                sum -= Math.pow(x, i) / fact;
                check=true;
            }
            fact = 1;
        }

        System.out.println(sum);
    }
}
