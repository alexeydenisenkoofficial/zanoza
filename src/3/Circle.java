package 3;

public class Circle {
    private String color;
    private double radius;
    

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle:" + "color = " + color + " radius = " + radius;
    }

}
