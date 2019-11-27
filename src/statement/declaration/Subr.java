package statement.declaration;

import statement.Statement;


public class Subr extends Statement {
    private byte call;
    private byte pushi;

    public Subr() {
        call = (byte) 44;
        pushi = (byte) 70;
    }

    // Only usage of this statement: subr 0 main
    // This statement will only/always be found at the first line of the input file
    public byte[] generateOpcodes(String[] tokens) {

        // Currently hard coding call instruction as call is only used for the initial main subroutine
        byte[] opcodes = new byte[1];
        opcodes[0] = pushi;
        opcodes = append(opcodes, integerToBytes(11));  // location of next instruction after subr and call
        opcodes = append(opcodes, pushi);
        opcodes = append(opcodes, integerToBytes(0));  // offset of main subroutine
        opcodes = append(opcodes, call);

        return opcodes;
    }
}
