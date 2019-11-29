package statement.control;

import statement.Statement;


public class Jmpc extends Statement {
    private static byte jmpc = (byte) 40;

    public byte[] generateOpcodes(String[] tokens) {
        int location = symbol_table.getOrDefault("main" + tokens[1], 0);  // default location if this is the first read
        String[] value = {"pushi", Integer.toString(location)};

        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, jmpc);

        return opcodes;
    }
}
