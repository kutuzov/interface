package shapes;

public class Sqare implements Shape{
    int base;


    public Sqare(int base) {
        this.base = base;
    }

    @Override
    public float getArea() {
        return base*base;
    }
}
