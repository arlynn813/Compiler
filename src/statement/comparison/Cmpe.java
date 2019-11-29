package statement.comparison;

import statement.Statement;


public class Cmpe extends Statement {
    private static byte cmpe = (byte) 132;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {cmpe};
    }
}
