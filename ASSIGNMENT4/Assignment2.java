import java.util.Scanner;

/*WAP to check weather a number is Armstrong number or not using custom exception and interface? */

class NotArmstrongNumberException extends Exception {
    public NotArmstrongNumberException(String error) {
        super(error);
    }
}

interface Number {
    public boolean isArmstrong(int number);
}

public class Assignment2 implements Number {
    public static void main(String[] args) throws NotArmstrongNumberException {
        Scanner sc = new Scanner(System.in);
        Assignment2 obj = new Assignment2();
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (obj.isArmstrong(number)) {
            System.out.println("Yes it is an Armstrong Number");
        } else {
            throw new NotArmstrongNumberException("It is not an Armstrong Number");
        }
    }

    @Override
    public boolean isArmstrong(int number) {
        int digit = (String.valueOf(number)).length();
        int sum = 0, rem = 0, temp = number;
        while (temp > 0) {
            rem = temp % 10;
            sum += Math.pow(rem, digit);
            temp = temp / 10;
        }
        if (number == sum) {
            return true;
        }
        return false;
    }
}
