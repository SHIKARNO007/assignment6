package AbstractFactory.Victorian;

import AbstractFactory.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("This sofa has 4 legs. Designed in Victorian style.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit down here. It's Victorian chair.");
    }
}

