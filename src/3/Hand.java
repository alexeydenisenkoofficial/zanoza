package 3;

public class Hand {
    public int length;

    public Hand(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "length =" + length;
    }
}
