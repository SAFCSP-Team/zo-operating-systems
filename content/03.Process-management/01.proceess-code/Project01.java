
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;
import java.lang.ProcessBuilder;

//Problem: Write a program that displays the java version by running "java --version" command.
public class Project01 {

    public static void main(String[] args) {
        try {
            Process p = new ProcessBuilder("java", "--version").start(); 
            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream())); 
            String line = bfr.readLine();
            while (line != null) { 
                System.out.println(line);
                line = bfr.readLine();
            }
            System.out.println(p.isAlive());

            if(p.isAlive() == false) System.out.println(p.exitValue());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
