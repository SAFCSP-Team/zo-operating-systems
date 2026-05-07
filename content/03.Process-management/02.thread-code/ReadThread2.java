public class ReadThread2 {
    
    public static void main(String[] args) {
        Multithreading t0 = new Multithreading();
        t0.start();
    }
}

class Multithreading extends Thread{
    @Override
    public void run() {
        System.out.println( "Thread " + this.getName() + " is running");
    }
}
