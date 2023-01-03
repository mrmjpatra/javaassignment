
/*Write program to display following pattern using method overloading and constructor overloading?
Odd number based pyramid starts from value n received from user n+1
n+3 n+6
n+5 n+10 n+15
n+7 n+14 n+21 n+28
even number based pyramid starts from value n received from user
n+2 n+4 n+6
n+6 n+10 n+14 n+8 n+14 n+20 n+26
user defined character suppose entered character is k k
kk kkk kkkk */
package polymorphism;

class Pattern {
    int n;
    char ch;

    Pattern(int n) {
        this.n = n;
    }

    Pattern(char ch) {
        this.ch = ch;
    }

    public void printOddPattern(){
        int s=1;
        for (int i = 1; i <= 7; i=i+2) {
            for (int j = 1; j <= 4-s; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= s; k++) {
               System.out.print(n+"+"+(k*i)+" ");
            }
            s=s+1;
            System.out.println();
        }
    }
    public void printEvenPattern(){
        int s=0;
        for (int i = 2; i <= 8; i=i+2) {
            for (int j = 1; j <= 4-s; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= s; k++) {
               System.out.print(n+"+"+(k*i)+" ");
            }
            s=s+2;
            System.out.println();
        }
    }

}

public class Assignment2 {
    public static void main(String[] args) {
        Pattern pattern=new Pattern(5);
        pattern.printEvenPattern();
       
    }
}
