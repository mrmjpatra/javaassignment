package classobject;
/*Write a program to find area and perimeter of rectangle using class and object? */

class Reactangle{
    int l,b;
    public Reactangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return (2*(l+b));
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Reactangle rc=new Reactangle(2, 4);
        System.out.println(rc.area());
    }
}
