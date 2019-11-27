package statement;


public class Rstack {
    private static int gen_offset = 0;  // general offset for the file
    private int cur_offset;  // offset of a specific instruction


    public Rstack() {
        cur_offset = gen_offset;
        gen_offset++;
    }

    public int get_offset()
    {
        return cur_offset;
    }

}
