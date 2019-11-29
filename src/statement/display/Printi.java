package statement.display;

import statement.Statement;


public class Printi extends Statement {
    private static byte printi = (byte) 146;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", tokens[1]};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, printi);

        return opcodes;
    }
}
