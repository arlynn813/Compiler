package statement.manipulation;

import statement.Statement;


public class Pushi extends Statement {
    private byte pushi;

    public Pushi() {
        pushi = (byte) 70;
    }
    public void update_pc() {
        cur_pc = pc;
        pc += 5;
    }
    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        byte[] integerBytes = integerToBytes(Integer.parseInt(tokens[1]));

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerBytes);

        return opcodes;
    }
}
