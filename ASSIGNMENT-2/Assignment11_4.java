/*Write a program to perform following using the numbers in between 23 to 249?
 *  d) find number of palindrome numbers?
 */
public class Assignment11_4 {
    public static void main(String[] args) {
        int r, count = 0, sum = 0, temp;
        for (int i = 24; i < 249; i++) {

            temp = i;
            while (temp > 0) {
                r = temp % 10; // getting remainder
                sum = (sum * 10) + r;
                temp = temp / 10;
            }
            if (i == sum) {
                System.out.println(i);
            }

        }
        System.out.println("The number of palindrome number  is " + count);
    }
}
