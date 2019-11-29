package statement.declaration;

import statement.Rstack;
import statement.Statement;


public class Decl extends Statement {

    public byte[] generateOpcodes(String[] tokens) {
        if (!symbol_table.containsKey("main" + tokens[1])) {
            Rstack value = new Rstack();
            symbol_table.put("main" + tokens[1], value.get_offset());
        }

        String[] arr = {"pushi", "0"};
        return statementMap.get("pushi").generateOpcodes(arr);
    }
}