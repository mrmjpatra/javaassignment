package classobject;
/*Write a program to display type of triangle using sides of triangle? */

class CheckTriangle {
    public void check(float a, float b, float c) {
        if (a * 2 + b * 2 == c * 2 || a * 2 + c * 2 == b * 2 || c * 2 + b * 2 == a * 2)
            System.out.println("Right angle triangle");
        else if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || c == a)
            System.out.println("Iscoceles triangle");

    }
}
public class Assignment6 {
    public static void main(String[] args) {
        CheckTriangle ct=new CheckTriangle();
        ct.check(2, 2, 3);
    }
}
