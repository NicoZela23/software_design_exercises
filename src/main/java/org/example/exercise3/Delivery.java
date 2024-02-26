package org.example.exercise3;

class Delivery {
    private Location location;
    private int packageWeight;

    public Delivery(Location location, int packageWeight) {
        this.location = location;
        this.packageWeight = packageWeight;
    }

    public int getPackageWeight() {
        return packageWeight;
    }

    public Location getLocation() {
        return location;
    }
}

