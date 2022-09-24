import javax.xml.transform.Source;

//Sum of all even digits of any 4 digit number using condtional Operator
public class Assignment6_1 {
    public static void main(String[] args) {
        int num = 2242, rem = 0, sum = 0;

        rem = num % 10;
        sum += rem % 2 == 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        rem = num % 10;
        sum += rem % 2 == 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        rem = num % 10;
        sum += rem % 2 == 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        rem = num % 10;
        sum += rem % 2 == 0 ? rem : 0;
        num = num / 10;
        rem = 0;

        System.out.println("Sum of the even digit number is : " + sum);

    }
}
