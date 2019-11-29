package statement.arithmetic;

import statement.Statement;


public class Mul extends Statement {
    private static byte mul = (byte) 108;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {mul};
    }
}
