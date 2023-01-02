import java.util.Scanner;

/* WAP to create a list of prime Fibonacci series between user defined range and default range is 10 to 50 using interface? */

interface PrimeFibonacci {
    public void findPrimeFibonacci(int range);
}


public class Assignment1 implements PrimeFibonacci {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int range;
        System.out.println("Enter the range upto which you want to print ?");
        range = sc.nextInt();
        PrimeFibonacci obj = new Assignment1();
        obj.findPrimeFibonacci(range);
    }

    @Override
    public void findPrimeFibonacci(int range) {
        int fib1 = 0, fib2 = 1, fib3 = fib1 + fib2;
        System.out.println("The prime fibonaccie number are :: ");
        while (fib3 <= range) {
            if (isPrime(fib3)) {

                System.out.print(fib3+"\t");
            }
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
    }

    public static boolean isPrime(int num) {
        int count = 0;
        if (num == 1) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        }
        return true;
    }
}