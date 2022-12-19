package classobject;
import java.util.Scanner;

/*Write a java program to create banking application to perform following using using class and
object?
a) Initialize with initial balance Rs 3000
b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for deposit
c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance
d) check for balance */

class Bank{
    float balance=3000;
    public void deposit(float amount){
        if (amount<1000) {
            balance+=amount-100;
            System.out.println("100 rupess is deducted as a penality, Total balance is ::"+balance);
        }else{
            balance+=amount;
            System.out.println("Total Balance :: "+balance);
        }
    }
    public void withdraw(float amt){
        if (balance>1000) {
            balance-=amt;
            System.out.println("Balance after withdraw "+balance);
        }else{
            System.out.println("Your balance is low");
        }
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Bank bank=new Bank();
        boolean check=true;
        int amount;
        while (check) {
            System.out.println("Welcome to IGIT Bank");
            System.out.println("Choose the following choice");
            System.out.println("1 for Deposite");
            System.out.println("2 for Withdraw");
            System.out.println("3 to exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposite");
                    amount=sc.nextInt();
                    bank.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    amount=sc.nextInt();
                    bank.withdraw(amount);
                    break;
                case 3:
                   check=false; 
                   break;  
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
