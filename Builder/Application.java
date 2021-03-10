package Builder;

public class Application {

    public static void main(String[] args) {
        ConcreteBuilder1 b = new ConcreteBuilder1();

        Director d = new Director(b);

        d.make("simple");

        Product1 p = b.getResult();

        System.out.println("Doors: "+p.buildDoor()+"\n" +
                "Windows: "+p.buildWindow()+"\n" +
                "Rooms: "+p.buildRooms()+"\n"+
                "Roof: "+p.buildRoof()+"\n" +
                "Garage: "+p.buildGarage());
    }
}

