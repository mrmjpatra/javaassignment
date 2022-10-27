/*Write a program to perform following using the numbers in between 23 to 249 ?
    h)  find first five largest even number and smallest odd number
 */
public class Assignment11_9 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("The first five largest even number");
        for (int i = 24; i < 249; i++) {
            if (i%2==0 && count<=5) {
                System.out.println(i);
                count++;
            }
        }
        count=0;
        System.out.println("The first five smallest odd number");
        for (int i = 24; i < 249; i++) {
           
           if (i%2!=0 && count<=5) {
                System.out.println(i);
                count++;
            }
        }
        
    }
}
