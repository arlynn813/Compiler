package statement.manipulation;

import statement.Statement;


public class Poke extends Statement {
    private static byte poke = (byte) 90;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", tokens[1]};
        String[] variable = {"pushv", tokens[2]};

        byte[] opcodes = statementMap.get("pushv").generateOpcodes(variable);
        opcodes = append(opcodes, statementMap.get("pushi").generateOpcodes(value));
        opcodes = append(opcodes, poke);

        return opcodes;
    }
}
