/*Write a program to create simple calculator for addition, subtraction, division, multiplication, modulus, factorial, gcd, lcm, power, square root, cube root using class and object? */
package classobject;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public double mul(int a,int b){
        return a*b;
    }
    public float div(int a,int b){
        return a/b;
    }
    public float mod(int a,int b){
        return a%b;
    }
    public double fact(int num){
        double result=1;
        for (int i = num; i>1; i++) {
           result=result*num;
        }
        return result;
    }

    public int gcd(int a,int b){
        int gcd=1;
        for (int i = 1; i<=a && i<=b; i++) {
            if (a%i==0 && b%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
    public int lcm(int a,int b){
        return ((a*b)/gcd(a, b));
    }

    public double power(int n){
        return Math.pow(n, 2);
    }

    public double sqrt(int n){
        return Math.sqrt(n);
    }

    public double cube(int n){
        return Math.pow(n, 3);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(1, 10));
    }
}
