package statement;

public class Div extends Statement {
    private byte div;

    Div() {
        div = (byte) 112;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = div;
        return opcodes;
    }
}
