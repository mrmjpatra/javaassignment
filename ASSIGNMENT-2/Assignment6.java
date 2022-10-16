import java.util.Scanner;

/*Write a java program to check weather the given number is palindrome and prime or not? */
public class Assignment6 {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        temp = n;
        while (temp > 0) {
            r = temp % 10; // getting remainder
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if (n == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
          
    }
}
