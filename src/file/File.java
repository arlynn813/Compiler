package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class File {
    private String filename;

    public File(String f) {
        filename = f;
    }

    public void readLines() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Here, parse the line instead of printing
                System.out.println(line);
            }
        }
    }
}
