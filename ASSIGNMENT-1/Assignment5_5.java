/*find sum of product of corresponding digits of two any 4 digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1 */

public class Assignment5_5 {
    public static void main(String[] args) {

        int n = 1234, m = 7896, sum = 0;
        int a1, b1, c1, d1;
        int a2, b2, c2, d2;

        a1 = n % 10;
        n /= 10;

        b1 = n % 10;
        n /= 10;

        c1 = n % 10;
        n /= 10;

        d1 = n % 10;
        n /= 10;

        a2 = m % 10;
        m /= 10;
        b2 = m % 10;
        m /= 10;
        c2 = m % 10;
        m /= 10;
        d2 = m % 10;
        m /= 10;

        sum = a1 * a2 + b1 * b2 + c1 * c2 + d1 * d2;

        System.out.println("Sum of product of corresponding digits n=1234 and m=7896 is : "+sum);

    }
}
