package statement.control;

import statement.Statement;


public class Ret extends Statement {
    private static byte popa = (byte) 77;
    private static byte ret = (byte) 48;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", Integer.toString(0)};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        opcodes = append(opcodes, popa);
        opcodes = append(opcodes, ret);  // returning from main halts the program

        return opcodes;
    }
}
