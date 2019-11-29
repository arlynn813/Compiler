package statement.manipulation;

import statement.Statement;


public class Poke extends Statement {
    private static byte poke = (byte) 90;

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", Integer.toString(symbol_table.get("main" + tokens[2]))};
        byte[] opcodes = statementMap.get("pushi").generateOpcodes(value);
        value[1] = tokens[1];
        opcodes = append(opcodes, statementMap.get("pushi").generateOpcodes(value));
        opcodes = append(opcodes, poke);

        return opcodes;
    }
}
