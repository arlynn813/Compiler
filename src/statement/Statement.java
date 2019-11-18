package statement;


public class Statement {
    Statement() {}

    public byte[] generateOpcodes(String[] tokens) {
        System.out.println("unrecognized statement");

        // Note: if we decide to still return null here, we must raise an error from within the compile method
        return null;
    }
}
