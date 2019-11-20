package statement.manipulation;

import statement.Statement;


public class Swp extends Statement {
    private byte swp;

    public Swp() {
        swp = (byte) 94;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = swp;
        return opcodes;
    }
}
