package statement.manipulation;

import statement.Statement;


public class Popm extends Statement {
    private byte popm;
    private byte pushi;

    public Popm() {
        popm = (byte) 76;
        pushi = (byte) 70;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        byte[] integerBytes = integerToBytes(Integer.parseInt(tokens[1]));

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerBytes);
        opcodes = append(opcodes, popm);

        return opcodes;
    }
}
