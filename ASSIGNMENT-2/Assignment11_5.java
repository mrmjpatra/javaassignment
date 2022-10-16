/*find difference between average of palindrome and prime numbers?
 */
public class Assignment11_5 {
    public static void main(String[] args) {
        int temp,rem,rev=0,palcount=0,prcount=0,count=0;
        int sumpal=0,sumpr=0;
        for (int i = 24; i < 249; i++) {
            count=0;
            rev=0;
            rem=0;
            temp=i;
            while (temp>0) {
                rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
            }
            if (rev==i) {
                sumpal+=i;
                palcount++;
            }

            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==2) {
                sumpr+=i;
                prcount++;
            }
        }

        System.out.println("Difference between average of palindrome and prime numbers is :: "+((sumpal/palcount)-(sumpr/prcount)));
    }
}
