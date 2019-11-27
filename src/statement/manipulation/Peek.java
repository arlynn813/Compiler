package statement.manipulation;

import statement.Statement;


public class Peek extends Statement {
    private byte peek;
    private Pushv pushv;
    private Pushi pushi;

    public Peek() {
        peek = (byte) 86;
        pushv = new Pushv();
        pushi = new Pushi();
    }

    public byte[] generateOpcodes(String[] tokens) {
        String[] variable = {"pushv", tokens[1]};
        String[] value = {"pushi", tokens[2]};

        byte[] opcodes = pushv.generateOpcodes(variable);
        opcodes = append(opcodes, pushi.generateOpcodes(value));
        opcodes = append(opcodes, peek);

        return opcodes;
    }
}
