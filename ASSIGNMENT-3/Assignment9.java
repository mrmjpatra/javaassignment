import java.util.Stack;

/*Write a program to implement stack and perform following using class and object? 
a) create an stack of size 10 using array
b) insert 10 elements into stack using push and isfull method 
c) find factorial of difference between largest and smallest
element of stack
d) search any user defined element in stack using peak method 
e) delete 3 elements from stack using pop and isempty method 
f) display remaining element of stack */

class StackImpl{
    public void createStack(Stack<Integer> stack,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
    }

}

public class Assignment9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        StackImpl impl=new StackImpl();
        Stack<Integer> stack=new Stack<>();
        impl.createStack(stack, arr);
        System.out.println(stack);

        
    }
}
