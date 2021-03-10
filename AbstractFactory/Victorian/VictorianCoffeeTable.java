package AbstractFactory.Victorian;

import AbstractFactory.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("This coffee table has 4 legs. Designed in Victorian style.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit down here. It's Victorian chair.");
    }
}

