package statement.arithmetic;

import statement.Statement;


public class Sub extends Statement {
    private static byte sub = (byte) 104;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {sub};
    }
}
