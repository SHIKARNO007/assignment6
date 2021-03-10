package Builder;

public class ConcreteBuilder1 implements Builder{
    private Product1 result;

    @Override
    public void reset() {
        result = new Product1();
    }

    @Override
    public boolean buildWindow() {
        return true;
    }

    @Override
    public boolean buildDoor() {
        return true;
    }

    @Override
    public int buildRooms() {
        return 4;
    }

    @Override
    public String buildRoof() {
        return "Wood Roof";
    }

    @Override
    public boolean buildSwimmingPool() {
        return true;
    }

    @Override
    public boolean buildGarage() {
        return false;
    }

    Product1 getResult(){
        return this.result;
    }
}
