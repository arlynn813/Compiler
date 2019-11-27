package statement.display;

import statement.Statement;


public class Printv extends Statement {
    private byte pushi;
    private byte pushvi;
    private byte printi;

    public Printv() {
        pushi = (byte) 70;
        pushvi = (byte) 74;
        printi = (byte) 146;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];

        opcodes[0] = pushi;
        int offset = symbol_table.get("main" + tokens[1]) - 1;  // -1 is hacky solution to offset problem
        opcodes = append(opcodes, integerToBytes(offset));
        opcodes = append(opcodes, pushvi);
        opcodes = append(opcodes, printi);

        return opcodes;

    }
}
