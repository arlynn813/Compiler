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
        int location = symbol_table.get("main" + tokens[1]);  // jump location is offset immediately after label
        String[] value = {"pushi", Integer.toString(location)};
       // String[] value = {"pushi", Integer.toString(22)};  // this is currently the hardcoded pc after the label in jmp.txt

        byte[] opcodes = pushi.generateOpcodes(value);
        opcodes = append(opcodes, jmpc);

        return opcodes;
    }
}
