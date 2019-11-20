package statement.arithmetic;

import statement.Statement;


public class Mul extends Statement {
    private byte mul;

    public Mul() {
        mul = (byte) 108;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = mul;
        return opcodes;
    }
}
