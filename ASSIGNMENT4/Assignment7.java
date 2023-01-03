import java.util.Scanner;

/*. WAP to compute factorial, GCD, LCM, sqrt without using any library function, swap two number Without using 3rd variable using multithreading? */

class MyThreadTest implements Runnable {
    Scanner sc;
    String compute;

    MyThreadTest(String compute) {
        this.compute = compute;
    }

    @Override
    public void run() {
        sc = new Scanner(System.in);
        if (compute.equals("factorial")) {
            System.out.println("Enter the number to find the factorial");
            int num = sc.nextInt();
            findFactorial(num);
        } else if (compute.equals("gcd")) {
            System.out.println("Enter the two number for gcd");
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            System.out.println("GCD of two number " + gcd(x, y));
        } else if (compute.equals("lcm")) {
            System.out.println("Enter the two number for lcm");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int lcm=((x*y)/gcd(x, y));
            System.out.println("LCM Of two number "+lcm);

        } else if (compute.equals("sqrt")) {
            System.out.println("Enter the number to find square root");
            int num = sc.nextInt();
            findSquareRoot(num);
        } else if (compute.equals("swap")) {
            System.out.println("Enter the two number");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Two number  " + x + " & " + y);
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swapping two number : " + x + " & " + y);
        }

    }

    public int gcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private void findSquareRoot(int num) {
        System.out.println("Square root : " + Math.sqrt(num));
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
    public static void main(String[] args) throws Exception {
        MyThreadTest test1 = new MyThreadTest("factorial");
        Thread t1 = new Thread(test1);
        t1.start();
        MyThreadTest test2 = new MyThreadTest("sqrt");
        Thread t2 = new Thread(test2);
        t1.join();
        t2.start();
        MyThreadTest test3 = new MyThreadTest("swap");
        Thread t3 = new Thread(test3);
        t2.join();
        t3.start();

        MyThreadTest test4=new MyThreadTest("gcd");
        Thread t4=new Thread(test4);
        t3.join();
        t4.start();

        MyThreadTest test5=new MyThreadTest("lcm");
        Thread t5=new Thread(test5);
        t4.join();
        t5.start();

    }
}
