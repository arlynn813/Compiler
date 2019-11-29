package statement.arithmetic;

import statement.Statement;


public class Div extends Statement {
    private static byte div = (byte) 112;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {div};
    }
}
