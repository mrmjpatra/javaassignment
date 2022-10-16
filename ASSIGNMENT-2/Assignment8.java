import java.util.Scanner;

/*Write a program to find following data of student using mark of four subjects like 
C, C++, Java, and Python. Mark of 4 subjects will be accepted at the run time and 
credit of all the mentioned subject is 3? 
         a) Grade of 4 subjects?
         b) Total Mark and %age of mark secured by Students?
        c) SGPA of Student?

*/
public class Assignment8 {
    public static void main(String[] args) {
        int m1,m2,m3,m4,total;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in C");
        m1=sc.nextInt();
        System.out.println("Enter marks in C++");
        m2=sc.nextInt();
        System.out.println("Enter marks in Java");
        m3=sc.nextInt();
        System.out.println("Enter marks in Python");
        m4=sc.nextInt();

        total=m1+m2+m3+m4;
        per=(float)total/4;
        
    }
}
