import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;
import java.lang.ProcessBuilder;

// Run the date command and print its output using the concept of processes. 
public class Main {

    public static void main(String[] args) {
        try {

            Process p = new ProcessBuilder("date").start(); //Create a process to run date program
            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream())); //Read the process output data as an input
            String line = bfr.readLine();
            while (line  != null) { //Loop through the process output and print it until it is finished
                System.out.println(line);
                line = bfr.readLine();
            }
            System.out.println(p.exitValue());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
