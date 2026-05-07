public class TerminateThread1 {
    
    public static void main(String[] args) throws InterruptedException {
        Multithreading t0 = new Multithreading();
        t0.start();
        System.out.println(t0.getState());
    }
}

class Multithreading extends Thread{
    @Override
    public void run() {
        System.out.println( "Thread " + this.getName() + " is running");
    }
}
