package statement;
import java.util.*;

public class Statement {
    public Statement() {}
    protected static Map<String,Integer> symbol_table = new HashMap<>();
    public static int pc; //program counter
    public int cur_pc = pc; //current reading line's pc, initialize to pc

    public byte[] generateOpcodes(String[] tokens) {
        // This method should NEVER be called. It is simply overridden by all the derived classes
        // We just want to retain the Statement object type so we can map strings to objects
        return null;
    }
    public int get_pc(){return pc;}

    // Append single byte to byte array
    protected static byte[] append(byte[] bytes, byte b) {
        byte[] newBytes = new byte[bytes.length + 1];
        int i;

        for (i = 0; i < bytes.length; i++) {
            newBytes[i] = bytes[i];
        }

        newBytes[i] = b;
        return newBytes;
    }

    // Append array of bytes to byte array
    protected static byte[] append(byte[] bytes, byte[] b) {
        byte[] newBytes = new byte[bytes.length + b.length];
        int i;

        for (i = 0; i < bytes.length; i++) {
            newBytes[i] = bytes[i];
        }

        for (i = bytes.length; i < (bytes.length + b.length); i++) {
            newBytes[i] = b[i - bytes.length];
        }

        return newBytes;
    }

    protected static byte[] integerToBytes(int integer) {
        byte[] bytes = new byte[4];
        bytes[3] = (byte) ((integer >> 24) & 0xFF);
        bytes[2] = (byte) ((integer >> 16) & 0xFF);
        bytes[1] = (byte) ((integer >> 8) & 0xFF);
        bytes[0] = (byte) (integer & 0xFF);

        return bytes;
    }
    public void update_pc() {    }

    public void update_lab(String[] tokens) {  }
}
