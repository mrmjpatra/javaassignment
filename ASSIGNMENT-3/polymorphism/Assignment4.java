/*Write a program to calculate interest that may be simple or compound using method overloading? */
package polymorphism;

import java.util.Calendar;

class Interest {
    public double calculateInterest(int p, float t, float r) {
        return (p * t * r) / 100;
    }
    public double calculateInterest(int p, float t, float r, int n) {
        return (p * Math.pow((1 + r / n), n * t));
    }

}
public class Assignment4 {
    public static void main(String[] args) {
        Interest interest = new Interest();
        int p = 10000;
        float r = 5.0f;
        float t = 2.5f;
        int n = 4;
        System.out.println(interest.calculateInterest(p, t, r, 2));
    }
}
