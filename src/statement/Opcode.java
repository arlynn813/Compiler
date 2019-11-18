package statement;

import java.util.HashMap;
import java.util.Map;


public class Opcode {
    // Make sure statementObjects and statementStrings are in the correct order for mapping!
    private static Statement[] statementObjects = {new Printi()};
    private static String[] statementStrings = {"printi"};
    private static Map<String, Statement> statementMap = new HashMap<>();

    public Opcode() {
        // Map strings to objects
        for (int i = 0; i < statementStrings.length; i++) {
            statementMap.put(statementStrings[i], statementObjects[i]);
        }
    }

    public byte[] generateOpcodes(String[] tokens) {
        if (statementMap.containsKey(tokens[0])) {
            return statementMap.get(tokens[0]).generateOpcodes(tokens);
        }

        // Note: if we decide to still return null here, we must raise an error from within the compile method
        System.out.println("unrecognized statement");
        return null;
    }
}
