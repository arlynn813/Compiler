package statement;

import statement.declaration.*;
import statement.arithmetic.*;
import statement.comparison.*;
import statement.display.*;
import statement.manipulation.*;

import java.util.HashMap;
import java.util.Map;


public class Opcode {

    // Make sure statementObjects and statementStrings are in the correct order for mapping!
    private static Statement[] statementObjects = {new Printi(), new Pushi(), new Cmpe(), new Cmplt(), new Cmpgt(),
            new Swp(), new Add(), new Sub(), new Mul(), new Div(), new Popm(), new Decl(), new Subr()};
    private static String[] statementStrings = {"printi", "pushi", "cmpe", "cmplt", "cmpgt", "swp", "add", "sub",
            "mul", "div", "popm", "decl", "subr"};
    private static Map<String, Statement> statementMap = new HashMap<>();

    public Opcode() {
        // Map strings to objects
        for (int i = 0; i < statementStrings.length; i++) {
            statementMap.put(statementStrings[i], statementObjects[i]);
        }
    }

    public byte[] getOpcodes(String[] tokens) {
        if (statementMap.containsKey(tokens[0])) {
            return statementMap.get(tokens[0]).generateOpcodes(tokens);
        }

        // TODO: If we decide to still return null here, we must raise an error from within the compile method
        System.out.println("Statement not found. Make sure the statement is contained in statementStrings array.");
        return null;
    }
}
