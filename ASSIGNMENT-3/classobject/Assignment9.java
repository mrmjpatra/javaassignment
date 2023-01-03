import java.util.Scanner;

/*Write a program to implement stack and perform following using class and object? 
a) create an stack of size 10 using array
b) insert 10 elements into stack using push and isfull method 
c) find factorial of difference between largest and smallest
element of stack
d) search any user defined element in stack using peak method 
e) delete 3 elements from stack using pop and isempty method 
f) display remaining element of stack */

class Stack {
    int[] arr;
    int top = -1;

    Stack() {
        arr = new int[10];
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        // insert 10 elements into stack using push and isfull method
        System.out.println("Enter the element to the stack");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            push(num);
        }
    }

    public void push(int num) {

        if (isFull()) {
            System.out.println("stack is full");
        } else {
            top = top + 1;
            arr[top] = num;
        }
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            System.out.println(arr[top] + " is poped");
            top = top - 1;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("The element on the stack");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    public void sort() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                for (int j = i + 1; j <= top; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public void factorial() {
        sort();
        int num = arr[top] - arr[0];
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial between largest and smallest element is " +
                fact);
    }

    public void peak(int target) {
        if (!isEmpty()) {
            boolean found = false;
            for (int i = 0; i <= top; i++) {
                if (arr[i] == target) {
                    found = true;
                }
            }
            if (found) {
                System.out.println("Element is found");
            } else {
                System.out.println("Element is not found");
            }
        }
    }

}

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack stack = new Stack();
        stack.read();
        // find factorial of difference between largest and smallest element of stack
        stack.factorial();
        // search any user defined element in stack using peak method
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        stack.peak(target);
        // delete 3 elements from stack using pop and isempty method
        stack.pop();
        stack.pop();
        stack.pop();
        // display remaining element of stack
        stack.print();
    }
}
