class Pyramid extends Thread{
    int a;
    Pyramid(int a){
        this.a=a;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j >i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(a+" ");
                a=a+2;
            }

            System.out.println();
        }
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        try {
            
            Pyramid t1=new Pyramid(1);
            Pyramid t2=new Pyramid(2);
            t1.start();
            t1.join();
            t2.start();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
