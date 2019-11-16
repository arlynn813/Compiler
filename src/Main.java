import file.FileIn;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        // Still need to handle case of no input filename

        FileIn file = new FileIn(args[0]);
        file.readLines();
    }
}
