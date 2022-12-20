class Pyramid implements Runnable{
    int a;
    Thread t;
    Pyramid(int a){
        this.a=a;
        t=new Thread(this);
        t.start();
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
            
           Pyramid t1=new Pyramid(1);
          
           try {
            t1.t.join();
            Pyramid t2=new Pyramid(2);
           } catch (Exception e) {
                e.printStackTrace();
           }
          
        
    }
}
