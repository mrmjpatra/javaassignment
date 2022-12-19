import java.util.Scanner;

/*WAP to create scientific calculator and perform all arithmetic operations like
sum,substraction,division,multiplication,modulus,power,sqrt,cubic root, sinx, cos x, tanx, logx, exp x, absolute value of x using interface and package?  */

interface Calculator {
    public long sum(long a, long b);

    public long sub(long a, long b);

    public double mul(long a, long b);

    public double div(long a, long b);

    public int module(int a, int b);

    public double power(long a, int b);

    public double sqrt(double a);

    public double cubicRoot(double a);

    public double sinx(float a);

    public double cosx(float a);

    public double tanx(float a);

    public double logx(float a);

    public double exp(float a);

    public double absolute(double a);
}

public class Assignment5 implements Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        int choice;
        boolean action = true;
        Assignment5 obj = new Assignment5();
        while (action) {
            a = 0;
            b = 0;
            System.out.println("========================================================");
            System.out.println("Which Arithmetic Operation do you want to execute");
            System.out.println(
                    "1- For Addition \n2- For Substraction \n3- For Multiplication\n4- For Division\n5- For Module\n6- For Power\n7- For Square Root\n8- For Cube Root\n9- For sinx\n10- For cosx\n11- For tanx\n12- For logx\n13- For exp\n3- For absolute\n\n Enter 0 to exit");
            System.out.println("========================================================");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    action = false;
                    break;
                case 1:
                    System.out.println("Enter the two for number for addition");
                    a = sc.nextLong();
                    b = sc.nextLong();
                    System.out.println("Answer : " + obj.sum(a, b));
                    break;
                case 2:
                    System.out.println("Enter the two for number for subtraction");
                    a = sc.nextLong();
                    b = sc.nextLong();
                    System.out.println("Answer : " + obj.sub(a, b));
                    break;
                case 3:
                    System.out.println("Enter the two for number for Multiplication");
                    a = sc.nextLong();
                    b = sc.nextLong();
                    System.out.println("Answer : " + obj.mul(a, b));
                    break;
                case 4:
                    System.out.println("Enter the two for number for Division");
                    a = sc.nextLong();
                    b = sc.nextLong();
                    System.out.println("Answer : " + obj.div(a, b));
                    break;
                case 5:
                    System.out.println("Enter the two for number for Module");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Answer : " + obj.module(x, y));
                    break;
                case 6:
                    System.out.println("Enter the number to find power");
                    a = sc.nextInt();
                    x = sc.nextInt();
                    System.out.println("Answer : " + obj.power(a, x));
                    break;
                case 7:
                    System.out.println("Enter the number to find Square root");
                    double c = sc.nextDouble();
                    System.out.println("Answer : " + obj.sqrt(c));
                    break;
                case 8:
                    System.out.println("Enter the number to find Cube root");
                    c = sc.nextDouble();
                    System.out.println("Answer : " + obj.cubicRoot(c));
                    break;
                case 9:
                    System.out.println("Enter the number to find sinx");
                    float d = sc.nextFloat();
                    System.out.println("Answer : " + obj.sinx(d));
                    break;
                case 10:
                    System.out.println("Enter the number to find cosx");
                    d = sc.nextFloat();
                    System.out.println("Answer : " + obj.cosx(d));
                    break;
                case 11:
                    System.out.println("Enter the number to find tanx");
                    d = sc.nextFloat();
                    System.out.println("Answer : " + obj.tanx(d));
                    break;
                case 12:
                    System.out.println("Enter the number to find logx");
                    d = sc.nextFloat();
                    System.out.println("Answer : " + obj.logx(d));
                    break;
                case 13:
                    System.out.println("Enter the number to find exp");
                    d = sc.nextFloat();
                    System.out.println("Answer : " + obj.exp(d));
                    break;
                case 14:
                    System.out.println("Enter the number to find absolute");
                    c = sc.nextDouble();
                    System.out.println("Answer : " + obj.absolute(c));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }

    @Override
    public long sum(long a, long b) {
        return a + b;
    }

    @Override
    public long sub(long a, long b) {
        return a - b;
    }

    @Override
    public double mul(long a, long b) {
        return a * b;
    }

    @Override
    public double div(long a, long b) {
        return a / b;
    }

    @Override
    public int module(int a, int b) {
        return a % b;
    }

    @Override
    public double power(long a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double cubicRoot(double a) {
        return Math.cbrt(a);
    }

    @Override
    public double sinx(float a) {
        return Math.sin(a);
    }

    @Override
    public double cosx(float a) {
        return Math.cos(a);

    }

    @Override
    public double tanx(float a) {
        return Math.tan(a);

    }

    @Override
    public double logx(float a) {
        return Math.log10(a);

    }

    @Override
    public double exp(float a) {
        return Math.exp(a);

    }

    @Override
    public double absolute(double a) {
        return Math.abs(a);

    }
}
