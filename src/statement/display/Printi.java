package statement.display;

import statement.Statement;


public class Printi extends Statement {
    private byte pushi;
    private byte printi;

    public Printi() {
        pushi = (byte) 70;
        printi = (byte) 146;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] integerBytes = integerToBytes(Integer.parseInt(tokens[1]));
        byte[] opcodes = new byte[1];

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerBytes);
        opcodes = append(opcodes, printi);

        return opcodes;
    }
}
