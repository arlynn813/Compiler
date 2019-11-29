package statement.arithmetic;

import statement.Statement;


public class Add extends Statement {
    private static byte add = (byte) 100;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {add};
    }
}
