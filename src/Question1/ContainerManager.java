package Question1;

import java.util.ArrayList;
import java.util.List;

public class ContainerManager {
    private List<IMeasurableContainer> containers;

    public ContainerManager() {
        containers = new ArrayList<>();
    }

    public void add(IMeasurableContainer container) {
        containers.add(container);
    }

    public double totalWeight() {
        return containers.stream().mapToDouble(IMeasurableContainer::weight).sum();
    }

    public double totalRectangularVolume() {
        return containers.stream().mapToDouble(IMeasurableContainer::rectangularVolume).sum();
    }

    public void clearAll() {
        containers.clear();
    }

    public List<IMeasurableContainer> getAllContainers() {
        return new ArrayList<>(containers);
    }

    public void display() {
        if (containers.isEmpty()) {
            System.out.println("No containers to display.");
            return;
        }

        System.out.println("Displaying all containers:");

        for (IMeasurableContainer container : containers) {
            if (container instanceof Box) {
                Box b = (Box) container;
                System.out.println("Box - Width: " + b.getWidth() + ", Height: " + b.getHeight() + ", Depth: " + b.getDepth() + ", Weight: " + b.weight());
            } else if (container instanceof Cylinder) {
                Cylinder c = (Cylinder) container;
                System.out.println("Cylinder - Radius: " + c.getRadius() + ", Height: " + c.getHeight() + ", Weight: " + c.weight());
            } else if (container instanceof Pyramid) {
                Pyramid p = (Pyramid) container;
                System.out.println("Pyramid - Side Length: " + p.getSideLength() + ", Height: " + p.getHeight() + ", Weight: " + p.weight());
            }
        }
    }
}
