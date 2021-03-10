package AbstractFactory.Modern;

import AbstractFactory.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("This coffee table has 1 main legs. Designed in modern.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit down here 'cause it's Modern coffee table.");
    }
}
