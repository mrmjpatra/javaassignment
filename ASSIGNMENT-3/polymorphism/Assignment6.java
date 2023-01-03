/*Write a program to check whether a number or string is palindrome or not using method overloading? */
package polymorphism;

class Palindrome{
    public void check(int num){
        int temp=num;
        int sum=0;
        while (temp!=0) {
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if (num==sum) {
            System.out.println("It's an palindrome number");
        }else{
            System.out.println("It's not an palindrome number");
        }
    }
    public void check(String s){
        String temp="";
        for (int i = s.length()-1; i >=0; i--) {
            temp+=s.charAt(i);
        }

        if (s.equals(temp)) {
            System.out.println("It is an palindrome string");
        }else{
            System.out.println("It's not an palindrome String");
        }
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        
    }
}
