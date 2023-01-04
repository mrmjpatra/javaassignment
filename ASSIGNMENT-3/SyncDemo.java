import javax.swing.*;

class Value {

    String a;
    String b;
    String result;

    public synchronized void act(String s)  {
        switch (s) {
            case "input1":
                a = JOptionPane.showInputDialog("enter 1st number");
                break;
            case "input2":
                b = JOptionPane.showInputDialog("enter 2nd number");
                break;
            case "result":

                int res = Integer.parseInt(a) + Integer.parseInt(b);
                result = "" + res;
                JOptionPane.showConfirmDialog(null, "result is" + res);
                break;
        }
    }

}

class ThreadPanel implements Runnable {
    Value v;
    Thread t;
    String s;

    ThreadPanel(String s ,Value v) {
        this.v=v;
        this.s = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        v.act(s);
    }

}

public class SyncDemo {
    public static void main(String[] args) {
        Value v=new Value();

        try {
            ThreadPanel t1 = new ThreadPanel("input1",v);
            t1.t.setPriority(10);
            //t1.t.join();
            ThreadPanel t2 = new ThreadPanel("input2",v);
            t2.t.setPriority(9);
           // t2.t.join();
            ThreadPanel t3 = new ThreadPanel("result",v);
            t3.t.setPriority(5);
          //  Thread.sleep(50000);
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}