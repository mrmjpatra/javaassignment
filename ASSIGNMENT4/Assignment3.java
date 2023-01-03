import java.util.Scanner;

/* WAP to check weather a number is palindrome number and divisible by 3 and 5 or not using custom exception and interface?  */

interface Number {
    public boolean checkNumber(int number);
}

class NotCheckNumberException extends Exception {
    public NotCheckNumberException(String error) {
        super(error);
    }
}

public class Assignment3 implements Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        Assignment3 obj = new Assignment3();
        System.out.println(obj.checkNumber(number));
    }

    @Override
    public boolean checkNumber(int number) {
        // here check wheather number is palidrome or not
        try {

            if (number % 3 == 0 || number % 5 == 0) {
                if (isPalindrome(number)) {
                    return true;
                }
            } else {
                throw new NotCheckNumberException("It is not palindrom number and not divisible by 3 or 5");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean isPalindrome(int number) {
        int temp = number, rem = 0, sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        if (number == sum) {
            return true;
        }
        return false;
    }
}
