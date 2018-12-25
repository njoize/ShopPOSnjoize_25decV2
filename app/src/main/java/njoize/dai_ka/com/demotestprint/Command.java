package njoize.dai_ka.com.demotestprint;

public class Command {


    public static final byte[] OVERLINE = new byte[] { 0x1B,0x2D,0x01 };

    public static final byte[] UNDERLINE = new byte[] { 0x1B,0x2D,0x01 };

    public static final byte[] ROW_SPACE = new byte[] { 0x1B, 0x31, 0x06 };

    public static final byte[] ROW_DEFAULT = new byte[] { 0x1B, 0x32 };

    public static final byte[] ROW = new byte[] { 0x1B, 0x33,0x00 };

    public static final byte[] INIT = new byte[] { 0x1B, 0x40 };

    public static final byte[] CLEAN = new byte[] { 0x18 };

    public static final byte[] LF = new byte[] { 0x0A };

    public static final byte[] CR = new byte[] { 0x0D };

    public static final byte[] DLE_EOT_1 = new byte[] { 0x10,0x04,0x01 };

    public static final byte[] DLE_EOT_2 = new byte[] { 0x10,0x04,0x02 };

    public static final byte[] DLE_EOT_3 = new byte[] { 0x10,0x04,0x03 };

    public static final byte[] DLE_EOT_4 = new byte[] { 0x10,0x04,0x04 };

    public static final byte[] DOUBLE_WIDTH = new byte[] { 0x1B,0x0E };
    public static final byte[] CANCEL_DOUBLE_WIDTH = new byte[] { 0x1B,0x14 };

    public static final byte[] BOLD = new byte[] { 0x1B,0x45,0x01 };
    public static final byte[] CANCEL_BOLD = new byte[] { 0x1B,0x45,0x00 };

    public static final byte[] MOVE_POINT = new byte[] { 0x1B,0x4A,0x00 };

    public static final byte[] FONT = new byte[] { 0x1B,0x4D,0x00 };

    public static final byte[] RINGHTMARGIN = new byte[] { 0x1B,0x51,0x05 };

    public static final byte[] TRANSVERSE = new byte[] { 0x1B,0x55,0x03 };

    public static final byte[] LONGITUDINAL = new byte[] { 0x1B,0x56,0x01 };

    public static final byte[] ALIGN_LEFT = new byte[] { 0x1B,0x61,0x00 };
    public static final byte[] ALIGN_CENTER = new byte[] { 0x1B,0x61,0x01 };
    public static final byte[] ALIGN_RIGHT = new byte[] { 0x1B,0x61,0x00 };

    public static final byte[] DIRECTION = new byte[] { 0x1B,0x63,0x00 };

    public static final byte[] MOVE_LINE = new byte[] { 0x1B,0x64,0x08 };

    public static final byte[] BLANK_LINE = new byte[] { 0x1B,0x66,0x00,0x02 };

    public static final byte[] LEFTMARGIN = new byte[] { 0x1B,0x61,0x01 };

    public static final byte[] ROTATION = new byte[] { 0x1B,0x49,0x00 };

}
