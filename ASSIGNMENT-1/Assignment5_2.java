/*find the face value and position value of any 4 digit number? */
public class Assignment5_2 {
    public static void main(String[] args) {
        int num;
        
        num = 6319;
        
        System.out.println("First number\n\tface value:"+(num/1000)+" \n\tposition value: "+(num - num % 1000));
        System.out.println("First number\n\tface value:"+(num/100%10)+" \n\tposition value: "+(num/100%10 * 100));
        System.out.println("First number\n\tface value:"+(num/10%10)+" \n\tposition value: "+(num/10%10 * 10));
        System.out.println("First number\n\tface value:"+(num%10)+" \n\tposition value: "+(num%10));
        
    }
}
