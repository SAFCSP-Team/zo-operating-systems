import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;
import java.lang.ProcessBuilder;

// Get the information of date process using ProcessHandle.
public class ProcessTerminate {

    public static void main(String[] args) {
        try {

            Process p = new ProcessBuilder("java", "--version").start(); //Create a process to run date program
            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream())); //Read the process output data as an input
            String line = bfr.readLine();
            while (line  != null) { //Loop through the process output and print it until it is finished
                System.out.println(line);
                line = bfr.readLine();
            }
            System.out.println(p.pid());
            System.out.println("Is alive before termination: " + p.isAlive());
            p.destroy();
            System.out.println("Is alive after termination: " +p.isAlive());
            System.out.println(p.exitValue());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
