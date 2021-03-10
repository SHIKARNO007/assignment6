package AbstractFactory.Modern;

import AbstractFactory.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("This chair has 4 legs. Designed in modern.");
    }

    @Override
    public void sitOn() {
        System.out.println("You're not allowed to sit down here. It's Modern chair.");
    }
}

