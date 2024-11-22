public class Cylinder
{
    private double radius;
    private double height;
    private double width;

    public Cylinder(double radius, double height, double width)
    {
        this.radius = radius;
        this.height = height;
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
