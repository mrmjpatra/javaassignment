/*Write a java program to find sum of product of corresponding even digits of
first any digit number and corresponding odd digit of any 4 digit number Such as
n=1234 m=4567 output=4*7+2*5 */
public class Assignment6_7 {
    public static void main(String[] args) {
        int m = 1234, n = 4567;
        int ans = 0, rem = 0;
        int a1, b1, c1, d1;
        int a2, b2, c2, d2;

        //First number
        rem = m % 10;
        a1 = rem % 2 == 0 ? rem : 0;
        rem = 0;
        m /= 10;
        System.out.println(a1);

        rem = m % 10;
        b1 = rem % 2 == 0 ? rem : 0;
        rem = 0;
        m /= 10;

        rem = m % 10;
        c1 = rem % 2 == 0 ? rem : 0;
        rem = 0;
        m /= 10;

        rem = m % 10;
        d1 = rem % 2 == 0 ? rem : 0;
        rem = 0;
        m /= 10;

        
        // second number
        rem = n % 10;
        a2 = rem % 2 != 0 ? rem : 0;
        rem = 0;
        n /= 10;

        rem = n % 10;
        b2 = rem % 2 != 0 ? rem : 0;
        rem = 0;
        n /= 10;

        rem = n % 10;
        c2 = rem % 2 != 0 ? rem : 0;
        rem = 0;
        n /= 10;

        rem = n % 10;
        d2 = rem % 2 != 0 ? rem : 0;
        rem = 0;
        n /= 10;

        ans += (a1 != 0 && a2 != 0) ? a1 * a2 : 0;
        ans += (b1 != 0 && b2 != 0) ? b1 * b2 : 0;
        ans += (c1 != 0 && c2 != 0) ? c1 * c2 : 0;
        ans += (d1 != 0 && d2 != 0) ? d1 * d2 : 0;

        System.out.println("Sum of product of corresponding even digits of first any digit number and corresponding odd digit of any 4 digit number Such as n=1234 m=4567"+ans);

    }
}
