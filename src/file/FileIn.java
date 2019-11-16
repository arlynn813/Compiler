package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileIn {
    private String filenameIn;
    private FileOut fileOut;

    public FileIn(String f1, String f2) {
        filenameIn = f1;
        fileOut = new FileOut(f2);
    }

    public void compile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filenameIn))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // Parse the line
                // Convert to opcode(s)
                // Write opcode(s)
                // fileOut.writeByte(line); --- tested and working with the line when method accepts a string
            }
        }
    }
}
