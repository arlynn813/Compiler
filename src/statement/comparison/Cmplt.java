package statement.comparison;

import statement.Statement;


public class Cmplt extends Statement {
    private byte cmplt;

    public Cmplt() {
        cmplt = (byte) 136;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = cmplt;
        return opcodes;
    }
}
