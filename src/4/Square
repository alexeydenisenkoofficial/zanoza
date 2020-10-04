package 4;

public class Square extends Rectangle{

    public Square(){
    }

    public Square( double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void setWidth(double width) {
        this.width = this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public String toString() {
        return "Square: " + "width = " + width + " length = " + length + " color = " + color + " filled=" + filled;
    }

    public static void main(String[] args) {
        Square s = new Square( 3, "Чёрный", true);

        System.out.println(s);
    }
}
