package statement.manipulation;

import statement.Statement;


public class Popv extends Statement {
    private static byte popv = (byte) 80;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", Integer.toString(symbol_table.get("main" + tokens[1]))};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, popv);

        return opcodes;
    }
}
