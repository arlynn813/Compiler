package statement.manipulation;

import statement.Statement;


public class Poke extends Statement {
    private byte poke;
    private Pushv pushv;
    private Pushi pushi;

    public Poke() {
        poke = (byte) 90;
        pushv = new Pushv();
        pushi = new Pushi();
    }

    public byte[] generateOpcodes(String[] tokens) {
        String[] value = {"pushi", tokens[1]};
        String[] variable = {"pushv", tokens[2]};

        byte[] opcodes = pushv.generateOpcodes(variable);
        opcodes = append(opcodes, pushi.generateOpcodes(value));
        opcodes = append(opcodes, poke);

        return opcodes;
    }
}
