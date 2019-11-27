package statement.declaration;

import statement.Statement;


public class Subr extends Statement {
    private byte[] call;
    private byte pushi;

    public Subr() {
        call = new byte[] {(byte) 44, (byte) 0};
        pushi = (byte) 70;
    }

    // Only usage of this statement: subr 0 main
    // This statement will only/always be found at the first line of the input file
    public byte[] generateOpcodes(String[] tokens) {

        // Instructor steps:
        // pushi 16
        // pushi 17
        // pushi 1
        // call

        byte[] opcodes = new byte[1];
        opcodes[0] = pushi;
        opcodes = append(opcodes, integerToBytes(16));
        opcodes = append(opcodes, pushi);
        opcodes = append(opcodes, integerToBytes(17));
        opcodes = append(opcodes, pushi);
        opcodes = append(opcodes, integerToBytes(1));
        opcodes = append(opcodes, call);

        return opcodes;
    }
    public void update_pc() {
        pc = 17;
    }
}
