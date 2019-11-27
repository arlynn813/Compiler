package statement.control;

import statement.Statement;
import statement.manipulation.Pushi;


public class Jmp extends Statement {
    private Pushi pushi;
    private byte jmp;

    public Jmp() {
        pushi = new Pushi();
        jmp = (byte) 36;
    }

    public byte[] generateOpcodes(String[] tokens) {
        int location = symbol_table.get("main" + tokens[1]);  // this location is incorrect
        String[] value = {"pushi", Integer.toString(location)};  // should be the pc offset of first instruction after label

        byte[] opcodes = pushi.generateOpcodes(value);
        opcodes = append(opcodes, jmp);

        return opcodes;
    }
}
