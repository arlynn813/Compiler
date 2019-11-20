package statement;

public class Cmplt extends Statement {
    private byte cmplt;

    Cmplt() {
        cmplt = (byte) 136;
    }

    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        opcodes[0] = cmplt;
        return opcodes;
    }
}
