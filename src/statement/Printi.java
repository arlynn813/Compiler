package statement;


public class Printi extends Statement {
    private byte pushi;
    private byte printi;

    Printi() {
        pushi = (byte) 70;
        printi = (byte) 146;
    }

    // TODO: printi could print a literal or variable... Need to implement variable functionality
    public byte[] generateOpcodes(String[] tokens) {
        byte[] integerBytes = integerToBytes(Integer.parseInt(tokens[1]));
        byte[] opcodes = new byte[1];

        opcodes[0] = pushi;
        opcodes = append(opcodes, integerBytes);
        opcodes = append(opcodes, printi);

        return opcodes;
    }
}
