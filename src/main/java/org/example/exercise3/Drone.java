package org.example.exercise3;

import java.util.ArrayList;
import java.util.List;

class Drone {
    private String name;
    private int maxWeight;
    private List<Delivery> deliveries;

    public Drone(String name, int maxWeight) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.deliveries = new ArrayList<>();
    }

    public void addDelivery(Location location, int packageWeight) {
        deliveries.add(new Delivery(location, packageWeight));
    }

    public int totalDeliveryWeight() {
        return deliveries.stream().mapToInt(Delivery::getPackageWeight).sum();
    }

    public boolean canHandleDelivery(int packageWeight) {
        return totalDeliveryWeight() + packageWeight <= maxWeight;
    }

    @Override
    public String toString() {
        return name;
    }
}
