/*Write a program to perform following using the numbers in between 23 to 249 ?
  j) find the sum of product of corresponding digits of 2nd largest even number and   3rd smallest odd number?
 */
public class Assignment11_10 {
    public static void main(String[] args) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int firstsmall=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        int thirdsmall=Integer.MAX_VALUE;
        for (int i = 24; i < 249; i++) {
           if (i%2==0) {
                if (i>max1) {
                    max2=max1;
                    max1=i;
                }else if(i>max2 && max1<i){
                    max2=i;
                }
           }else if(i%2!=0){
                if (i<firstsmall) {
                    thirdsmall=secondsmall;
                    secondsmall=firstsmall;
                    firstsmall=i;
                }else if(i<secondsmall && firstsmall>i){
                    secondsmall=i;
                }else if (i<thirdsmall && secondsmall>i) {
                    thirdsmall=i;
                }
            }
           
        }
        
        
        System.out.println(firstsmall);
        System.out.println(secondsmall);
        System.out.println(thirdsmall);

    }
}