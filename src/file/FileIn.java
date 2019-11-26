package file;

import statement.Opcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileIn {
    private String filenameIn;
    private FileOut fileOut;

    public FileIn(String f1, String f2) throws IOException {
        filenameIn = f1;
        fileOut = new FileOut(f2);
    }

    public void compile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filenameIn))) {
            String line;
            Opcode opcode = new Opcode();

            while ((line = br.readLine()) != null) {

                // Continue if line is not a comment or blank
                if (!line.startsWith("/") && !line.isBlank()) {
                    byte[] binaryOpcodes = opcode.getOpcodes(getTokens(line));  // get opcodes for current line
                    fileOut.writeBytes(binaryOpcodes);
                }
            }

            // Halt the program
            fileOut.writeByte((byte) 0);
        }
    }

     private String[] getTokens(String line) {
        line = line.trim( );
        line = line.replaceAll(",", " , ");
        line = line.replaceAll("\\s+", " ");
        return line.split("\\s");
    }
}
