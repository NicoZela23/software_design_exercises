package org.example.exercise3;

public class DroneDeliverySystem {
    public static void main(String[] args) {
        Drone drone1 = new Drone("Drone A", 50);
        Drone drone2 = new Drone("Drone B", 70);

        Location location1 = new Location("Location X", 20);
        Location location2 = new Location("Location Y", 30);

        drone1.addDelivery(location1, 15);
        drone2.addDelivery(location2, 25);

        System.out.println(drone1 + " deliveries: " + drone1.totalDeliveryWeight());
        System.out.println(drone2 + " deliveries: " + drone2.totalDeliveryWeight());
    }
}
