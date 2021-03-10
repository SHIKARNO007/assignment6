package AbstractFactory.Victorian;

import AbstractFactory.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("This chair has 4 legs. Designed in Victorian style.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit down here. It's Victorian chair.");
    }
}

