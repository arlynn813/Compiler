package statement.control;

import statement.Statement;


public class Jmp extends Statement {
    private static byte jmp = (byte) 36;


    public byte[] generateOpcodes(String[] tokens) {
        int location = symbol_table.getOrDefault("main" + tokens[1], 0);  /// default location if this is the first read
        String[] value = {"pushi", Integer.toString(location)};  // should be the pc offset of first instruction after label

        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, jmp);

        return opcodes;
    }
}
