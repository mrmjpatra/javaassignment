public class Sync {
    public static void main(String[] args) {
        Example e = new Example();
        new Thread1("Sonu ", e);
        new Thread1("Kriti", e);
    }


}

class Thread1 implements Runnable{
    Thread t;
    String name;
    Example e;
    Thread1(String name , Example e){
        this.name = name;
        this.e = e;
        t = new Thread(this);
        t.start();
       
    }

    public void run(){
        e.eg(name);
    }
}
class Example {
    
    public synchronized void eg(String n){
        int i=1;
        while(i<=10){
            System.out.println(" "+i+" "+n);
            i++;
            if(i==5){
            try{

                Thread.sleep(5000);
            }catch(Exception e){

            }}
        }
    }
}