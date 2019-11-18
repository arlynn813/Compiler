package statement;


public class Printi extends Statement {
    Printi() {}

    public byte[] generateOpcodes(String[] tokens) {
        System.out.println("bc.pushi " + tokens[1]);
        System.out.println("bc.printi");

        // Needs to be changed to actual bytecode representation when algorithm is implemented
        return null;
    }
}
