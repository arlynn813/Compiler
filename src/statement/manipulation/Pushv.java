package statement.manipulation;

import statement.Statement;


public class Pushv extends Statement {
    private static byte pushvi = (byte) 74;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", Integer.toString(symbol_table.get("main" + tokens[1]))};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, pushvi);

        return opcodes;
    }
}
