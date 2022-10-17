import java.rmi.Remote;

/*11. Write a program to perform following using the numbers in between 23 to 249?
        a) find number of even numbers that ends with 0 and 4?
 */
public class Assignment11_1 {
    public static void main(String[] args) {
        int rem,count=0;
       for (int i = 24; i < 249; i++) {
                rem=i%10;
                if (rem==0 || rem==4) {
                    count++;
                }
       } 

       System.out.println("The number of even number that ends with 0 and 4 is "+count);
    }
}
