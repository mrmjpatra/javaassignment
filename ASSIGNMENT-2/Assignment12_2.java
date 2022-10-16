/*Write a java program to find following of 10 numbers using command line 
arguments? Do not use array?
     b) find difference between average of all odd numbers and even numbers?
*/
public class Assignment12_2 {
    public static void main(String[] args) {
        int s_even=0,s_odd=0,ecount=0,ocount=0;
        for (int i = 0; i < args.length; i++) {
            int temp=Integer.parseInt(args[i]);
            if (temp%2==0) {
                s_even+=temp;
                ecount++;
            }else {
                s_odd+=temp;
                ocount++;
            }
        }
        System.out.println(ecount);
        System.out.println(s_even);
        System.out.println(s_odd);
        System.out.println("Difference between average of all odd numbers and even numbers is :: "+((s_even/ecount)-(s_odd/ocount)));
        
    }
}
