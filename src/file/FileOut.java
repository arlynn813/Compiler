package file;

import java.io.FileWriter;
import java.io.IOException;


public class FileOut {
    private FileWriter fw;

    public FileOut(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            fw = writer;
        }
    }

    public void writeByte(byte b) throws IOException {
        fw.write(b);
    }
}
