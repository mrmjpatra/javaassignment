public class Assignment4_8 extends Thread {
    public synchronized void printPyramid(int n) {
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 4 - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(n + " ");
                    Thread.sleep(1000);
                    n = n + 2;
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
        }
    }

    public void run() {
        printPyramid(2);
    }

    public static void main(String[] args) {
       
        Assignment4_8 obj = new Assignment4_8();
        obj.printPyramid(1);
        obj.start();
    }
}