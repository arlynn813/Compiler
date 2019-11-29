package statement.manipulation;

import statement.Statement;


public class Peek extends Statement {
    private static byte peek = (byte) 86;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", Integer.toString(symbol_table.get("main" + tokens[1]))};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        value[1] = tokens[2];
        opcodes = append(opcodes, statementMap.get("pushi").generateOpcodes(value));
        opcodes = append(opcodes, peek);

        return opcodes;
    }
}
