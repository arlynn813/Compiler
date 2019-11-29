package statement.control;

import statement.Statement;
import statement.manipulation.Pushi;


public class Jmpc extends Statement {
    private Pushi pushi;
    private byte jmpc;

    public Jmpc() {
        pushi = new Pushi();
        jmpc = (byte) 40;
    }

    public byte[] generateOpcodes(String[] tokens) {
        int location = symbol_table.getOrDefault("main" + tokens[1], 0);  // default location if this is the first read
        String[] value = {"pushi", Integer.toString(location)};

        byte[] opcodes = pushi.generateOpcodes(value);
        opcodes = append(opcodes, jmpc);

        return opcodes;
    }
}
