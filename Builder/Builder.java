package Builder;

public interface Builder {

    void reset();

    boolean buildWindow();
    boolean buildDoor();
    int buildRooms();
    String buildRoof();
    boolean buildSwimmingPool();
    boolean buildGarage();

}

