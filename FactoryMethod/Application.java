package FactoryMethod;

public class Application {
    public static void main(String[] args) {

        Logistics truck = new RoadLogistics();

        truck.planDelivery();

        Logistics ship = new SeaLogistics();

        ship.planDelivery();
    }
}
