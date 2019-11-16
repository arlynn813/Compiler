package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class FileOut {
    private String filename;

    FileOut(String f) {
        filename = f;
    }

    void writeByte(byte b) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(b);
        }
    }
}
