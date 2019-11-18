package file;

import statement.Opcode;

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
            Opcode opcode = new Opcode();

            while ((line = br.readLine()) != null) {

                // Continue if line is not a comment
                if (!line.startsWith("/")) {
                    byte[] binaryOpcodes = opcode.generateOpcodes(getTokens(line));  // get opcodes for current line

                    // Write opcodes to outfile
                    // Note: this loop cannot run until specific generateOpcodes methods are finished
                    // See Printi.generateOpcode for more details - currently binaryOpcodes is always null

                    /*
                    for (byte binaryOpcode : binaryOpcodes) {
                        fileOut.writeByte(binaryOpcode);
                    }
                    */
                }
            }
        }
    }

    private String[] getTokens(String line) {
        line = line.trim( );
        line = line.replaceAll(",", " , ");
        line = line.replaceAll("\\s+", " ");
        return line.split("\\s");
    }
}