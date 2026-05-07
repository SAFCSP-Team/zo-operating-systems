public class TerminateThread2 {
    
    public static void main(String[] args) throws InterruptedException {
        Multithreading t0 = new Multithreading();
        t0.start();
        t0.sleep(3000);
        System.out.println(t0.getState());
    }
}

class Multithreading extends Thread{
    @Override
    public void run() {
        System.out.println( "Thread " + this.getName() + " is running");
    }
}
