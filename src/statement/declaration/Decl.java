package statement.declaration;

import statement.Rstack;
import statement.Statement;
import statement.manipulation.Pushi;


public class Decl extends Statement {
    String Var; //variable name


    public String getkey(String key, String func_label) {
        return key+func_label;
    }
    public byte[] generateOpcodes(String[] tokens) {
        Rstack value = new Rstack(tokens[1]+ tokens[2]);
        symbol_table.put(getkey("main",tokens[1]),value.get_offset());
        Pushi out_obj = new Pushi();
        String[] arr = {"pushi","0"};
        return out_obj.generateOpcodes(arr);
    }
}