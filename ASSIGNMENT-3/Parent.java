public class Parent {
    public String methodOne(){
        System.out.println("Parent");
        return " ";
    }
}
class Child extends Parent{
    public Object methodOne(){
        System.out.println("child");
        return "name";
    }
}

