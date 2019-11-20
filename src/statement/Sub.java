package statement;


public class Sub extends Statement {
    private byte sub;

    Sub() {
        sub = (byte) 104;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = sub;
        return opcodes;
    }
}
