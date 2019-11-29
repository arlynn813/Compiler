package statement.manipulation;

import statement.Statement;


public class Pushi extends Statement {
    private static byte pushi = (byte) 70;

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        byte[] integerBytes = integerToBytes(Integer.parseInt(tokens[1]));

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerBytes);

        return opcodes;
    }
}
