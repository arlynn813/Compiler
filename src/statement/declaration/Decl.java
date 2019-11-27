package statement.declaration;

import statement.Rstack;
import statement.Statement;
import statement.manipulation.Pushi;


public class Decl extends Statement {

    public byte[] generateOpcodes(String[] tokens) {
        Rstack value = new Rstack();
        symbol_table.put("main" + tokens[1],value.get_offset());
        Pushi out_obj = new Pushi();
        String[] arr = {"pushi", "0"};
        return out_obj.generateOpcodes(arr);
    }
}