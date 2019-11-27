package statement.declaration;


import statement.Rstack;
import statement.Statement;

public class Lab extends Statement {

    public byte[] generateOpcodes(String[] tokens) {
        Rstack value = new Rstack();
        symbol_table.put("main" + tokens[1], value.get_offset());
        return null;
    }
}
