package statement.comparison;

import statement.Statement;


public class Cmpe extends Statement {
    private byte cmpe;

    public Cmpe() {
        cmpe = (byte) 132;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = cmpe;
        return opcodes;
    }
}
