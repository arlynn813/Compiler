package statement;


public class Statement {
    Statement() {}

    public byte[] generateOpcodes(String[] tokens) {
        // This method should NEVER be called. It is simply overridden by all the derived classes
        // We just want to retain the Statement object type so we can map strings to objects
        return null;
    }
}
