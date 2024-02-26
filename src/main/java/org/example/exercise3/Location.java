package org.example.exercise3;

class Location {
    private String name;
    private int packageWeight;

    public Location(String name, int packageWeight) {
        this.name = name;
        this.packageWeight = packageWeight;
    }

    public int getPackageWeight() {
        return packageWeight;
    }

    @Override
    public String toString() {
        return name;
    }
}
