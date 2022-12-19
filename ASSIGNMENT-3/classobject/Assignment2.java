/*Write a program to give information about any number such as whether it is even odd, prime or not prime, or positive or negative, palindrome or not using class and object? */
package classobject;

class CheckNumber{
    int num;
    public CheckNumber(int num){
        this.num=num;
    }
    public void isEven(){
        if (num%2==0) {
            System.out.println("It is a even number");
        }else{
            System.out.println("It is not a even number");
        }
    }
    public void isPrime(){
        int count=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Is is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    public void isPositive(){
        if (num>=0) {
            System.out.println("It is Positive number");
        }else{
            System.out.println("It is not a positve number");
        }
    }
    public void isPalindrome(){
        int rev=0;
        int rem=0;
        int og=num;
        while (og>0) {
            rem=og%10;
            rev=rev*10+rem;
            og=og/10;
        }

        if (rev==num) {
            System.out.println("It is not a Palindrome Number");
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        CheckNumber cn=new CheckNumber(11);
        cn.isPalindrome();
    }
}
