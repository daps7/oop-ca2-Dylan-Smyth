package Question1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContainerManager manager = new ContainerManager();

        Box box = new Box(2, 3, 4, 10.5);
        Cylinder cylinder = new Cylinder(2.0, 5.0, 15.0);
        Pyramid pyramid = new Pyramid(3.0, 6.0, 8.0);

        manager.add(box);
        manager.add(cylinder);
        manager.add(pyramid);

        System.out.println("Total Weight: " + manager.totalWeight());
        System.out.println("Total Rectangular Volume: " + manager.totalRectangularVolume());

        List<IMeasurableContainer> containers = manager.getAllContainers();
        for (IMeasurableContainer container : containers) {
            if (container instanceof Box) {
                Box b = (Box) container;
                System.out.println("Box : Width: " + b.getWidth() + ", Height: " + b.getHeight() + ", Depth: " + b.getDepth() + ", Weight: " + b.weight());
            } else if (container instanceof Cylinder) {
                Cylinder c = (Cylinder) container;
                System.out.println("Cylinder : Radius: " + c.getRadius() + ", Height: " + c.getHeight() + ", Weight: " + c.weight());
            } else if (container instanceof Pyramid) {
                Pyramid p = (Pyramid) container;
                System.out.println("Pyramid : Side Length: " + p.getSideLength() + ", Height: " + p.getHeight() + ", Weight: " + p.weight());
            }
        }
    }
}
