package statement.manipulation;

import statement.Statement;


public class Peek extends Statement {
    private static byte peek = (byte) 86;

    public byte[] generateOpcodes(String[] tokens) {
        String[] variable = {"pushv", tokens[1]};
        String[] value = {"pushi", tokens[2]};

        byte[] opcodes = statementMap.get("pushv").generateOpcodes(variable);
        opcodes = append(opcodes, statementMap.get("pushi").generateOpcodes(value));
        opcodes = append(opcodes, peek);

        return opcodes;
    }
}
