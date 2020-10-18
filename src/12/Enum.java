public enum Enum {

    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    Magenta(35),
    Cyan(36),
    BrightRed(91),
    BrightGreen(92),
    BrightYellow(93),
    BrightBlue(94),
    BrightMagenta(95),
    BrightCyan(96);

    private final int Col_Code;

    Enum(int Col_Code){
        this.Col_Code = Col_Code;
    }

    public int getCol_Code() {
        return Col_Code;
    }
}
