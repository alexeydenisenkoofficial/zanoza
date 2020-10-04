package 5;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int Speedx;
    private int Speedy;

    public MovablePoint(int x, int y, int Speedx, int Speedy) {
        this.x = x;
        this.y = y;
        this.Speedx = Speedx;
        this.Speedy = Speedy;
    }

    @Override
    public void moveUp() {
        this.y += Speedy;
    }

    @Override
    public void moveDown() {
        this.y -= Speedy;
    }

    @Override
    public void moveLeft() {
        this.x -= Speedx;
    }

    @Override
    public void moveRight() {
        this.x += Speedx;
    }

    public void setSpeed(int x, int y){
        this.Speedx = x;
        this.Speedy = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return Speedx;
    }

    public void setxSpeed(int xSpeed) {
        this.Speedx = Speedx;
    }

    public int getySpeed() {
        return Speedy;
    }

    public void setySpeed(int ySpeed) {
        this.Speedy = Speedy;
    }

    @Override
    public String toString() {
        return "MovablePoint:" + "x = " + x + " y = " + y + " Speedx = " + Speedx + " Speedy = " + Speedy;
    }
}
