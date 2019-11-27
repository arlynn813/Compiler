package statement.control;

import statement.Statement;


public class Ret extends Statement {
    private byte pushi;
    private byte popa;
    private byte ret;

    public Ret() {
        ret = (byte) 48;
        pushi = (byte) 70;
        popa = (byte) 77;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = pushi;
        opcodes = append(opcodes, integerToBytes(0));
        opcodes = append(opcodes, popa);
        opcodes = append(opcodes, ret);

        return opcodes;
    }
}
