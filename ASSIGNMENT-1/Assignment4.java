/*Write a java program to implement adder circuit and booth algorithm
using bitwise operator? */

public class Assignment4 {
    public static void main(String[] args) {
        int num1=0, num2=0 ,  C_In=0, C_Out;
        int sum;
         //for half adder circuit
         sum = num1 ^ num2;
         C_Out = num1 & num2;
         System.out.println("Sum = "+ sum);
         System.out.println("C_out= "+C_Out);

        //for full adder
        sum=C_In ^ (num1 ^ num2);
        C_Out = (num1 & num2) | (num2 &C_In) | (num1&C_In);
        System.out.println("Sum ="+ sum);
        System.out.println("C_out="+C_Out);

        
    }
}
