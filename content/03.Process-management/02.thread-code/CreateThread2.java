public class CreateThread2 {
    
    public static void main(String[] args) {
        /* first way */
        Multithreading runnableThread = new Multithreading();
        Thread t0 = new Thread(runnableThread);
        
        /* second way */
        // Thread t0 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println( "Thread is running");
        //     }
        // });
        t0.start();
    }
}

class Multithreading implements Runnable{
    @Override
    public void run() {
        System.out.println( "Thread is running");
    }
}
