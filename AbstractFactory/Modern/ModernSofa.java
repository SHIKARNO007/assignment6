package AbstractFactory.Modern;

import AbstractFactory.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("This sofa has 4 legs. Designed in modern.");
    }

    @Override
    public void sitOn() {
        System.out.println("You're not allowed to sit down here. It's Modern sofa.");
    }
}
