/*Write a program to implement queue and perform following using class and object? a) create an queue of size 10 using array
b) insert 10 elements into queue using insert method
c) replace even numbers available in queue with nearest prime numbers 
d) display number of odd and prime numbers.
e) delete 3 elements from queue using delete method
f) display remaining element of queue. */

package classobject;

import java.util.Scanner;

class Queue {
    private int arr[];
    private int rear = -1, front = -1;

    Queue() {
        arr = new int[10];
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        // insert 10 elements into queue using insert method
        System.out.println("Enter the elements to the queue");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            insert(num);
        }
    }

    public void insert(int num) {
        if (isEmpty()) {
            front = 0;
        }
        if (!isFull()) {
            rear = rear + 1;
            arr[rear] = num;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void delete() {
        if (!isEmpty()) {
            front++;
        } else {
            System.out.println("stack is empty");
        }
    }

    public boolean isFull() {
        if (front == 0 && rear == arr.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println("Elements in Queue");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    // replace even numbers available in queue with nearest prime numbers

    public void replace() {
        for (int i = front; i <= rear; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = nearestPrimeNumber(arr[i]);
            }
        }
    }

    private int nearestPrimeNumber(int num) {
        int val1 = 1, val2 = 1;
        int count1 = 0, count2 = 0;
        for (int i = num; i >= 1; i--) {
            count1++;
            if (isPrime(i)) {
                val1 = i;
                break;
            }
        }

        for (int i = num; i <= num * num; i++) {
            count2++;
            if (isPrime(i)) {
                val2 = i;
                break;
            }
        }

        if (count1 > count2) {
            return val2;
        } else {
            return val1;
        }
    }

    private boolean isPrime(int i) {
        if (i == 1) {
            return true;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public void displayOddPrimeNumber() {
        int count1 = 0, count2 = 0;
        for (int i = front; i <= rear; i++) {
            if (arr[i] % 2 != 0) {
                count1++;
            }
            if (isPrime(arr[i])) {
                count2++;
            }
        }

        System.out.println("Number of odd numbers :: " + count1);
        System.out.println("Number of Prime numbers :: " + count2);
    }
}

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        queue.read();
        // replace even numbers available in queue with nearest prime numbers
        //queue.replace();
        // display number of odd and prime numbers.
        queue.displayOddPrimeNumber();
        // delete 3 elements from queue using delete method
        queue.delete();
        queue.delete();
        queue.delete();
        // display remaining element of queue.
        queue.print();

    }
}
