class DispatchVehicle {
    static void outOfDelivery() {
        System.out.println("Package out for delivery");
        DeliveryAgent.reachDoorStep();
    }
}