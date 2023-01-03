/*Write a program to create simple calculator for addition, subtraction, division, multiplication, modulus, factorial, gcd, lcm, power, square root, cube root using class and object? */
package classobject;

import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public float mod(int a, int b) {
        return a % b;
    }

    public double fact(int num) {
        double result = 1;
        for (int i = num; i > 1; i++) {
            result = result * num;
        }
        return result;
    }

    public int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public int lcm(int a, int b) {
        return ((a * b) / gcd(a, b));
    }

    public double power(int num, int n) {
        return Math.pow(num, n);
    }

    public double sqrt(int n) {
        return Math.sqrt(n);
    }

    public double cube(double n) {
        return Math.cbrt(n);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        int x, y;
        Calculator calculator = new Calculator();
        boolean action = true;
        while (action) {
            int choice;
            System.out.println(
                    "Enter\n1 for Addition\n2 for subtraction\n3 Division\n4 for Multiplication\n5 for modulus\n6 for factorial\n7 for gcd\n8 for lcm \n9 for Power of Number\n10 for square root \n11 for cube root");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    action = false;
                    break;
                case 1:
                    System.out.println("Enter the two number");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Addition of two number " + calculator.add(a, b));
                    break;
                case 2:
                    System.out.println("Enter the two number");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Subtraction of two number " + calculator.sub(a, b));
                    break;
                case 3:
                    System.out.println("Enter the two number");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Division of two number " + calculator.div(a, b));
                    break;
                case 4:
                    System.out.println("Enter the two number");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Multiplication of two number " + calculator.mul(a, b));
                    break;
                case 5:
                    System.out.println("Enter the two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Modulus of two number " + calculator.mod(x, y));
                    break;
                case 6:
                    System.out.println("Enter the  number");
                    x = sc.nextInt();
                    System.out.println("Factorial of number " + calculator.fact(x));
                    break;
                case 7:
                    System.out.println("Enter the two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Gcd of two number " + calculator.gcd(x, y));
                    break;
                case 8:
                    System.out.println("Enter the two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("LCM of two number " + calculator.lcm(x, y));
                    break;
                case 9:
                    System.out.println("Enter the number and it's power");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Power of " + x + "^" + y + " number " + calculator.power(x, y));
                    break;
                case 10:
                    System.out.println("Enter the number");
                    x = sc.nextInt();
                    System.out.println("Square root is " + calculator.sqrt(x));
                    break;

                case 11:
                    System.out.println("Enter the number");
                    a=sc.nextDouble()
                    System.out.println("Cube root is " + calculator.cube(x));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
