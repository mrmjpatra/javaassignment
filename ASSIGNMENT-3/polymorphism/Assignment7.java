/*Write a program to find volume of rectangle and square box using constructor overloading? */
package polymorphism;

class Volume{
    public Volume(double r){
        System.out.println("Volume of square box is "+(r*r*r));
    }
    public Volume(double l,double b,double h){
        System.out.println("Volume of reactangle box is "+(l*b*h));
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Volume volume1=new Volume(4);
        Volume volume2=new Volume(4,5,6);

    }
}
