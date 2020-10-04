package 3;

public class Head {
    public double size;

    public Head(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "size = " + size;
    }
}
