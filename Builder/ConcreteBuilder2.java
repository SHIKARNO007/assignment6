package Builder;

public class ConcreteBuilder2 implements Builder{
    private Product2 result;

    @Override
    public void reset() {
        result = new Product2();
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
        return 5;
    }

    @Override
    public String buildRoof() {
        return "Sheefer";
    }

    @Override
    public boolean buildSwimmingPool() {
        return false;
    }

    @Override
    public boolean buildGarage() {
        return true;
    }

    Product2 getResult(){
        return this.result;
    }
}
