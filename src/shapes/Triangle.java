package shapes;

public class Triangle implements Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (float) ((base*height)*0.5);
    }
}
