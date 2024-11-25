package Question1;

public class Pyramid implements IMeasurableContainer {
    private double sideLength;
    private double height;
    private double weight;

    public Pyramid(double sideLength, double height, double weight) {
        this.sideLength = sideLength;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight; // Return the weight of the pyramid.
    }

    @Override
    public double rectangularVolume() {
        return sideLength * sideLength * height; // Volume of the enclosing rectangular box.
    }

    // Getters and setters

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
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
