/*Write a java program to find following of 10 numbers using command line 
arguments? Do not use array?
    a) find difference between greatest and smallest number?
*/
public class Assignment12_1 {
    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE,smallest=Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i < args.length; i++) {
             temp=Integer.parseInt(args[i]);
            if (temp>largest) {
                largest=temp;
            }

            if (temp<smallest) {
                smallest=temp;
            }
        }

        System.out.println("The difference between largest and smallest number is "+(largest-smallest));
    }
}
