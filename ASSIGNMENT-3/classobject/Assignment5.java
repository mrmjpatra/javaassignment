package classobject;
/*Write a program to find area and perimeter of triangle having 3 sides using class and object? */
class Triangle{
    
    public double area(float a,float b,float c){
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public double perimeter(int a,int b,int c){
        return a+b+c;
    }
}
public class Assignment5 {

    public static void main(String[] args) {
        Triangle ta=new Triangle();
        System.out.println(ta.area(3, 2, 1));
    }
}
