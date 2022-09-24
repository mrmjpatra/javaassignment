//Find the value available at position required by user it may be 10,100 and 1000

public class Assignment5_3 {
    public static void main(String[] args) {
        int num=6198;
        
        System.out.println("The number: "+num);
        System.out.println("Value available at position 1000: "+(num/1000));
        System.out.println("Value available at position 100: "+(num/100%10));
        System.out.println("Value available at position 10: "+(num/10%10));
        System.out.println("Value available at position 1: "+(num%10));
    }
}
