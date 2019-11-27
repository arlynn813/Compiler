package statement.manipulation;

import statement.Statement;


public class Popv extends Statement {
    private byte pushi;
    private byte popv;

    public Popv() {
        pushi = (byte) 70;
        popv = (byte) 80;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        byte[] location = integerToBytes(symbol_table.get("main" + tokens[1]) - 1);  // -1 is hacky solution to offset problem

        opcodes[0] = pushi;
        opcodes = append(opcodes, location);
        opcodes = append(opcodes, popv);

        return opcodes;
    }
}
