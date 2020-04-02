package shapes;

public class Rectangle implements Shape{
    int base;
    int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return base*height;
    }
}
