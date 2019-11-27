package statement.declaration;


import statement.Rstack;
import statement.Statement;

public class Lab extends Statement {

    public void update_lab(String[] tokens) {
        Rstack value = new Rstack();
        symbol_table.put("main" + tokens[1],cur_pc);
    }
}
