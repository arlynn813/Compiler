package statement;


public class Cmpgt extends Statement {
    private byte cmpgt;

    Cmpgt() {
        cmpgt = (byte) 140;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = cmpgt;
        return opcodes;
    }
}
