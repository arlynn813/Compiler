package statement.arithmetic;

import statement.Statement;


public class Div extends Statement {
    private byte div;

    public Div() {
        div = (byte) 112;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = div;
        return opcodes;
    }
}
