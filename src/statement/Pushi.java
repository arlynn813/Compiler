package statement;


public class Pushi extends Statement {
    private byte pushi;

    Pushi() {
        pushi = (byte) 70;
    }

    // TODO: pushi could print a literal or variable... Need to implement variable functionality
    public byte[] generateOpcodes(String[] tokens) {
        byte[] opcodes = new byte[1];
        byte[] integerBytes = integerToBytes(Integer.parseInt(tokens[1]));

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerBytes);

        return opcodes;
    }
}
