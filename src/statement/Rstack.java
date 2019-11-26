package statement;

import java.util.Vector;

public class Rstack {
    public static int gen_offset = 0; //general offset for the file
    private int cur_offset = 0; //offset of a specific instruction
    private String type_var;


    public Rstack()
    {

    }
    public Rstack(String typed)
    {
        cur_offset = gen_offset;
        gen_offset++;
        type_var = typed;
    }

    public int get_offset()
    {
        return cur_offset;
    }

}
