package statement.declaration;

import statement.Statement;


public class Lab extends Statement {

    public void addLabel(String[] tokens, int offset) {
        symbol_table.put("main" + tokens[1], offset);
    }
}
