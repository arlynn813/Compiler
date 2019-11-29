package statement.comparison;

import statement.Statement;


public class Cmplt extends Statement {
    private static byte cmplt = (byte) 136;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {cmplt};
    }
}
