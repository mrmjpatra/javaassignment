import java.util.Scanner;

/*. WAP to compute factorial, GCD, LCM, sqrt without using any library function, swap two number Without using 3rd variable using multithreading? */

class MyThreadTest implements Runnable {
    Scanner sc;
    String compute;
    Thread t;

    MyThreadTest(String compute) {
        this.compute = compute;
        t = new Thread(this);
        t.start();
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
            int lcm = ((x * y) / gcd(x, y));
            System.out.println("LCM Of two number " + lcm);

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
        try {
            MyThreadTest test1 = new MyThreadTest("factorial");
            test1.t.join();
            MyThreadTest test2 = new MyThreadTest("sqrt");
            test2.t.join();
            MyThreadTest test3 = new MyThreadTest("swap");
            test3.t.join();
            MyThreadTest test4 = new MyThreadTest("gcd");
            test4.t.join();
            MyThreadTest test5 = new MyThreadTest("lcm");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
