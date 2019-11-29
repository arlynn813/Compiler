package statement.manipulation;

import statement.Statement;


public class Popm extends Statement {
    private static byte popm = (byte) 76;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", tokens[1]};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, popm);

        return opcodes;
    }
}
