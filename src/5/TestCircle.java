package 5;

public class TestCircle {
    public static void main(String[] args) {

        MovableRectangle rectangle = new MovableRectangle(0,3,1,1,2,5,1,1);

        System.out.println(rectangle);

        rectangle.setHeight(10);

        rectangle.setWidth(5);

        System.out.println(rectangle);

        rectangle.moveDown();

        System.out.println(rectangle);
    }
}
