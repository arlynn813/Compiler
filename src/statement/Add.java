package statement;


public class Add extends Statement {
    private byte add;

    Add() {
        add = (byte) 100;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = add;
        return opcodes;
    }
}
