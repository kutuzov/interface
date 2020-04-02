package shapes;

public class Round implements Shape{
    int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI*(radius*radius));
    }
}
