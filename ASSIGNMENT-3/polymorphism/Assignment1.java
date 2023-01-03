/*Write a program to find area and perimeter of circle,square,rectangle and triangle using method overloading? */
package polymorphism;

class AreaPerimeter {
    //circle
    public double area(int r) {
        return (Math.PI * r * r);
    }
    //square
    public double area(double r) {
        return r * r;
    }

    //reactangle
    public double area(double l, double b) {
        return (l * b);
    }

    //triangle
    public double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    //circle
    public double perimeter(int r) {
        return 2 * Math.PI * r;
    }

    //square
    public double perimeter(float r) {
        return 4 * r;
    }

    //reactangle
    public double perimeter(double l, double r) {
        return (l * r);
    }

    //triangle
    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        AreaPerimeter ap = new AreaPerimeter();
        //circle
        System.out.println("Area of the circle : "+ap.area(4));
        System.out.println("Perimeter of the circle : "+ap.perimeter(4));
        //square
        System.out.println("Area of the square : "+ap.area(4.0));
        System.out.println("Perimeter of the square : "+ap.perimeter(4.0f));

        //reactangle
        System.out.println("Area of the reactangle : "+ap.area(4.0, 3.5));
        System.out.println("Perimeter of the reactangle : "+ap.perimeter(4.0, 3.5));
        //triangle

        System.out.println("Area of the triangle : "+ap.area(4, 5, 6));
        System.out.println("Perimeter of the triangle : "+ap.perimeter(4, 5, 6));
    }
}
