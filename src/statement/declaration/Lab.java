package statement.declaration;


import statement.Rstack;
import statement.Statement;

public class Lab extends Statement {
    String label;

    public byte[] generateOpcodes(String[] tokens) {
        label = tokens[1] + "main";
        Rstack temp = new Rstack();
        symbol_table.put(label, temp.gen_offset);
        return null;//CONSIDER: whenever generateOpcodes returns null, we should ot write anything to the output file
    }
}
