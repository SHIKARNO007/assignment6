package Builder;

public class Director {
    private Builder builder;

    Director(Builder builder){
        this.builder = builder;
    }

    void changeBuilder(Builder builder){
        this.builder = builder;
    }

    void make(String type) {
        builder.reset();

        if(type.equals("simple")){
            builder.buildDoor();
            builder.buildWindow();
            builder.buildRoof();
            builder.buildRooms();
            builder.buildGarage();
        }else{
            builder.buildSwimmingPool();
        }
    }
}
