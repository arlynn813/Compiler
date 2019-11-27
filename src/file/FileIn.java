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
            br.mark(0);
            String line;
            Opcode opcode = new Opcode();

            while ((line = br.readLine()) != null) {

                // Continue if line is not a comment or blank or lab
                if (!line.startsWith("/") && !line.isBlank()) {
                    opcode.set_pc(getTokens(line));  //update pc for each instruction, polymorphic call to update_pc()
                    if(line.startsWith("lab")){

                        opcode.up_lab(getTokens(line));
                    }
                }
            }

            BufferedReader brr = new BufferedReader(new FileReader(filenameIn));
            while ((line = brr.readLine()) != null) {

                // Continue if line is not a comment or blank
                if (!line.startsWith("/") && !line.isBlank()) {
                    byte[] binaryOpcodes = opcode.getOpcodes(getTokens(line));  // get opcodes for current line

                    // Check validity of opcodes
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
}
