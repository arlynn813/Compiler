import file.FileIn;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        // Still need to handle case of no input filename

        FileIn fileIn = new FileIn(args[0], args[1]);
        fileIn.compile();
    }
}
