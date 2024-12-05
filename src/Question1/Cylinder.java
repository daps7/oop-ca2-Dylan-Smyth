package Question1;

public class Cylinder implements IMeasurableContainer {
    private double radius;
    private double height;
    private double weight;

    public Cylinder(double radius, double height, double weight) {
        this.radius = radius;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight; // Return the weight of the cylinder.
    }

    @Override
    public double Volume() {
        double diameter = 2 * radius; // Diameter of the cylinder.
        return diameter * diameter * height; // Volume of the enclosing rectangular box.
    }

    // Getters and setters

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
