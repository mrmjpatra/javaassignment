// Sum of all odd digits of any 4 digit number
public class Assignment6_2 {
    public static void main(String[] args) {
        int num = 1243, rem = 0, sum = 0;

        rem = num % 10;
        sum += rem % 2 != 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        rem = num % 10;
        sum += rem % 2 != 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        rem = num % 10;
        sum += rem % 2 != 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        rem = num % 10;
        sum += rem % 2 != 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        System.out.println("Sum of all odd digit number is : " + sum);

    }
}
