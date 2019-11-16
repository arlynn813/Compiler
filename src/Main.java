import file.File;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        // Still need to handle case of no input filename

        File file = new File(args[0]);
        file.readLines();
    }
}
