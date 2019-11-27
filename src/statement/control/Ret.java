package statement.control;

import statement.Statement;


public class Ret extends Statement {
    private byte pushi;
    private byte popa;
    private byte halt;

    public Ret() {
        halt = (byte) 0;
        pushi = (byte) 70;
        popa = (byte) 77;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = pushi;
        opcodes = append(opcodes, integerToBytes(0));
        opcodes = append(opcodes, popa);
        opcodes = append(opcodes, halt);  // returning from main halts the program

        return opcodes;
    }
}
