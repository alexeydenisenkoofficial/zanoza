package 5;

import 4.*;

public class MovableCircle extends Circle implements Movable{
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int Speedx, int Speedy) {
        this.center = new MovablePoint(x, y, Speedx, Speedy);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle: " + " radius = " + radius + " center = " + center;
    }
}
