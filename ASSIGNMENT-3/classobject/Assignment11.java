/*
Write a program to swap two numbers without using 3rd variable and with using 3rd variable using class and object?
*/
package classobject;

class Number {
    int n1, n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void swap() {
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
    }

    public void print() {
        System.out.println("N1 is :: " + n1 + "\nN2 is :: " + n2);
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        Number number = new Number(10, 20);
        number.print();
        number.swap();
        number.print();
    }
}
