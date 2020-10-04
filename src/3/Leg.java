package 3;

public class Leg {
    public int length;

    public Leg(int length) {
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
