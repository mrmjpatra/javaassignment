import java.util.Scanner;

/*. WAP to compute factorial, GCD, LCM, sqrt without using any library function, swap two number Without using 3rd variable using multithreading? */

class MyThread extends Thread {
    Scanner sc;
    String compute;

    MyThread(String compute) {
        this.compute = compute;
    }

    @Override
    public void run() {
        sc = new Scanner(System.in);
        if (compute.equals("factorial")) {
            System.out.println("Enter the number to find the factorial");
            int num = sc.nextInt();
            findFactorial(num);
        }
        // else if (compute.equals("gcd")) {

        // }else if (compute.equals("lcm")) {

        // }
        else if (compute.equals("sqrt")) {
            System.out.println("Enter the number to find square root");
            int num = sc.nextInt();
            findSquareRoot(num);
        }
    }

    private void findSquareRoot(int num) {
       System.out.println("Square root : "+Math.sqrt(num));
    }

    private void findFactorial(int num) {
        long fact = 1;
        if (num == 1 || num == 0) {
            System.out.println("Factorial is : 1");
        } else {
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of number is " + fact);
        }
    }
}

public class Assignment7 {
    public static void main(String[] args)throws Exception {
        MyThread t1=new MyThread("factorial");
        t1.start();
        MyThread t2=new MyThread("sqrt");
        t1.join();
        t2.start();
    }
}
