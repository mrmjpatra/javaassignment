import java.util.Scanner;

/* Write a java program to find factorial of a number using while loop, do while loop and for loop all in one program?[hint use switch block] */
public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,fact=1,choice;
        System.out.println("Enter the number ");
        num=sc.nextInt();
        System.out.println("Enter the choice Press\n1-Using for loop.\n2-Using while loop\n3-Using do while loop");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <=num; i++) {
                    fact*=i;
                }
                System.out.println("Factorial of "+num+" is "+fact);
                break;
            case 2:
                int i=1;
                while (i<=num) {
                    fact*=i;
                    i++;
                }
                System.out.println("Factorial of "+num+" is "+fact);
                break;
            case 3:
                 i=1;
                do {
                    fact=fact*i;
                    i++;
                } while (i<=num);
                System.out.println("Factorial of "+num+" is "+fact);
                break;    
            default:
            System.out.println("Invalid Choice !!");
                break;
        }
    }
}
