package 5;

public class MovableRectangle implements Movable{
    public int height;
    public int width;
    public MovablePoint leftUp;
    public MovablePoint downRight;

    public MovableRectangle(int x, int y, int Speedx, int Speedy, int x1, int y1, int Speedx1, int Speedy1){
        this.leftUp = new MovablePoint(x, y, Speedx, Speedy);
        this.downRight = new MovablePoint(x1, y1, Speedx1, Speedy1);
        this.height = getHeight();
        this.width = getWidth();
    }

    public void setSpeed(int x, int y){
        leftUp.setSpeed(x, y);
        downRight.setSpeed(x, y);
    }

    @Override
    public void moveUp() {
        leftUp.moveUp();
        downRight.moveUp();
    }

    @Override
    public void moveDown() {
        leftUp.moveDown();
        downRight.moveDown();
    }

    @Override
    public void moveLeft() {
        leftUp.moveLeft();
        downRight.moveLeft();
    }

    @Override
    public void moveRight() {
        leftUp.moveRight();
        downRight.moveRight();
    }

    public int getHeight() {
        return Math.abs(leftUp.getY() - downRight.getY());
    }

    public int getWidth() {
        return Math.abs(downRight.getX() - leftUp.getX());
    }

    public void setHeight(int height) {
        leftUp.setY(leftUp.getY() + height - this.height);
        this.height = height;
    }

    public void setWidth(int width) {
        downRight.setX(downRight.getX() + width - this.width);
        this.width = width;
    }

    @Override
    public String toString() {
        return "MovableRectangle: " + "height = " + height + " width = " + width + " leftUp = " + leftUp + " downRight = " + downRight;
    }
}
