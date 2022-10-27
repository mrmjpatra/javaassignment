/*Write a program to perform following using the numbers in between 23 to 249?
    c) find number of prime numbers?
 */
public class Assignment11_3 {
    public static void main(String[] args) {
        int count=0,mcount=0;
        for (int i = 24; i < 249; i++) {

            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==2) {
                mcount++;
            }
            count=0;
        }
        System.out.println("The number of prime number  is "+mcount);
    }
}
