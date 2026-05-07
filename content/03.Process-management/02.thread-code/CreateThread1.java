public class CreateThread1 {
    
    public static void main(String[] args) {
        Multithreading t0 = new Multithreading();
        t0.start();
    }
}

class Multithreading extends Thread{
    @Override
    public void run() {
        System.out.println( "Thread is running");
    }
}
