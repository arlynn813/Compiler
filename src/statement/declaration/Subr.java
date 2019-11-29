package statement.declaration;

import statement.Statement;


public class Subr extends Statement {
    private static byte[] call = {(byte) 44, (byte) 0};

    // Only usage of this statement: subr 0 main
    // This statement will only/always be found at the first line of the input file
    public byte[] generateOpcodes(String[] tokens) {

        String[] value = {"pushi", Integer.toString(16)};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        value[1] = Integer.toString(17);
        opcodes = append(opcodes, statementMap.get("pushi").generateOpcodes(value));
        value[1] = Integer.toString(1);
        opcodes = append(opcodes, statementMap.get("pushi").generateOpcodes(value));
        opcodes = append(opcodes, call);

        return opcodes;
    }
}
