/*Write a program to perform following using the numbers in between 23 to 249?
     b)find number of odd numbers that ends with 5 and 7 */
public class Assignment11_2 {
    public static void main(String[] args) {
        int rem,count=0;
        for (int i = 24; i < 249; i++) {
                rem=i%10;
                if (rem==5 || rem==7) {
                    count++;
                }
        }
        System.out.println("The number of odd number that ends with 5 and 7 is "+count);
    }
}
