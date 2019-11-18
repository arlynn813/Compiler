package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;


class FileOut {
    private String filename;

    FileOut(String f) throws IOException {
        filename = f;
        File file = new File(filename);
        Files.deleteIfExists(file.toPath());
    }

    void writeByte(byte b) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(b);
        }
    }
}
