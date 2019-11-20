package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;


class FileOut {
    private String filename;

    FileOut(String f) throws IOException {
        filename = f;
        File file = new File(filename);
        Files.deleteIfExists(file.toPath());  // delete file if it exists from previous run to erase contents
        file.createNewFile();
    }

    void writeByte(byte b) throws IOException {
        try (FileOutputStream stream = new FileOutputStream(filename, true)) {
            stream.write(b);
        }
    }

    void writeBytes(byte[] bytes) throws IOException {
        for (byte b : bytes) {
            writeByte(b);
        }
    }
}
