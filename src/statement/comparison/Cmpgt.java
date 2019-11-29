package statement.comparison;

import statement.Statement;


public class Cmpgt extends Statement {
    private static byte cmpgt = (byte) 140;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {cmpgt};
    }
}
