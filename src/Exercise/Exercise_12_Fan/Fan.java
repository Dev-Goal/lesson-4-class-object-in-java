package Exercise.Exercise_12_Fan;

public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    int speed = 1;
    boolean status;
    double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean onFan, double radius, String color) {
        this.speed = speed;
        this.status = onFan;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan: Speed is " + speed + ", Radius is " + radius
                + ", Color is " + color + ", Status: " + status;
    }
}
