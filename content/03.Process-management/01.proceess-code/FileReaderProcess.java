import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderProcess {
    public static void printListOfFiles(String pathToDirectory){
        ProcessBuilder pb = new ProcessBuilder("ls","-la");
        pb.directory(new File(pathToDirectory));
        pb.inheritIO();
        // pb.redirectErrorStream(true);
        try {
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            int exitVal = process.waitFor();
            if (exitVal != 0) {
                System.out.println("Abnormal Behaviour! Something bad happened.");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Something went wrong. Here are more details\n"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        printListOfFiles("./");
    }
}
