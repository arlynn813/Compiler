package statement.manipulation;

import statement.Statement;


public class Pushv extends Statement {
    private byte pushvi;
    private byte pushi;

    public Pushv() {
        pushi = (byte) 71;
        pushvi = (byte) 74;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        int offset = symbol_table.get("main" + tokens[1]) - 1;  // -1 is hacky solution to offset problem
        System.out.println("Offset: " + offset);

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerToBytes(offset));
        opcodes = append(opcodes, pushvi);

        return opcodes;
    }
}
