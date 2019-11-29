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
        Opcode opcode = new Opcode();
        String line;
        setLabels(opcode);

        try (BufferedReader br = new BufferedReader(new FileReader(filenameIn))) {
            while ((line = br.readLine()) != null) {

                // Continue if line is not a comment or blank
                if (!line.startsWith("/") && !line.isBlank()) {
                    byte[] binaryOpcodes = opcode.getOpcodes(getTokens(line));  // get opcodes for current line

                    // Check validity of opcodes. This will catch lab and any unknown statement
                    if (binaryOpcodes != null) {
                        fileOut.writeBytes(binaryOpcodes);
                    }
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

    private void setLabels(Opcode opcode) throws IOException {
        int pc = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filenameIn))) {
            String line;

            while ((line = br.readLine()) != null) {

                // Continue if line is not a comment or blank
                if (!line.startsWith("/") && !line.isBlank()) {
                    byte[] binaryOpcodes = opcode.getOpcodes(getTokens(line));  // get opcodes for current line

                    if (line.startsWith("lab")) {
                        opcode.createLabel(getTokens(line), pc);
                    }

                    // Update pc for next label
                    else if (binaryOpcodes != null) {
                        pc += binaryOpcodes.length;
                    }
                }
            }
        }

    }
}
