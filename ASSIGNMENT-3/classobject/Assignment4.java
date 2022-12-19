package classobject;
/*Write a program to find area and perimeter of square using class and object? */

class Square{
    float a;
    public double area(float a){
        this.a=a;
        return a*a;
    }
    public double perimeter(float a){
        this.a=a;
        return 4*a;
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Square sq=new Square();
        System.out.println(sq.area(4));
    }
}
