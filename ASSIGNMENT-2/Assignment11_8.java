/*Write a program to perform following using the numbers in between 23 to 249 ?
    h) Check whether the difference between largest even number and smallest odd number is palindrome or not?
 */
public class Assignment11_8 {
    public static void main(String[] args) {
        int num, rem, rev = 0, temp;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 24; i < 249; i++) {
            if (i % 2 == 0) {
                if (i > largest) {
                    largest = i;
                }
            } else {
                if (i < smallest) {
                    smallest = i;
                }
            }
        }
        num = largest - smallest;
        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("The difference between "+largest+" and ("+smallest+(largest-smallest)+") is a palindrome number");
        } else {
            System.out.println("The difference between "+largest+" and "+smallest+" (" +(largest-smallest)+") is not a palindrome number");
        }
    }
}
