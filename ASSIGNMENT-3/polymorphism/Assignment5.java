/*Write a program to override sum method if arguments are numbers than it will add numbers or string than concat two strings using constructor overloading? */

package polymorphism;

import java.util.Scanner;

class Number {
    Scanner sc = new Scanner(System.in);

    public void sum() {
        System.out.println("Enter the two number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Sum of two number " + (n1 + n2));
    }

}

class Word extends Number {
    public void sum() {
        System.out.println("Enter two string");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1 + s2);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.sum();
        Word obj1 = new Word();
        obj1.sum();
    }
}
