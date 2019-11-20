package statement.arithmetic;

import statement.Statement;


public class Sub extends Statement {
    private byte sub;

    public Sub() {
        sub = (byte) 104;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = sub;
        return opcodes;
    }
}
