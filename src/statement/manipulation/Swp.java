package statement.manipulation;

import statement.Statement;


public class Swp extends Statement {
    private byte swp = (byte) 94;

    public byte[] generateOpcodes(String[] tokens) {
        return new byte[] {swp};
    }
}
