package classobject;
/*Write a program to display type of triangle using sides of triangle? */

class CheckTriangle {
    public void check(float a, float b, float c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a)
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
        ct.check(6, 8, 10);
    }
}
