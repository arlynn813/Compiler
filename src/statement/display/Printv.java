package statement.display;

import statement.Statement;


public class Printv extends Statement {
    private static byte pushvi = (byte) 74;
    private static byte printi = (byte) 146;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", Integer.toString(symbol_table.get("main" + tokens[1]))};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, pushvi);
        opcodes = append(opcodes, printi);

        return opcodes;
    }
}
