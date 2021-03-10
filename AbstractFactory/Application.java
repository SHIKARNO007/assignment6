package AbstractFactory;

import AbstractFactory.Modern.ModernFurnitureFactory;
import AbstractFactory.Victorian.VictorianMakingCompany;

public class Application {

    public static void main(String[] args) {
        System.out.println("Modern designed furniture");
        Companies factories = new ModernFurnitureFactory();

        Chair chair = factories.getChair();
        Sofa sofa = factories.getSofa();
        CoffeeTable table = factories.getTable();

        chair.hasLegs();
        chair.sitOn();

        sofa.hasLegs();
        sofa.sitOn();

        table.hasLegs();
        table.sitOn();

        System.out.println("Victorian designed furniture");
        Companies factories2 = new VictorianMakingCompany();

        Chair chair2 = factories2.getChair();
        Sofa sofa2 = factories2.getSofa();
        CoffeeTable table2 = factories2.getTable();

        chair2.hasLegs();
        chair2.sitOn();

        sofa2.hasLegs();
        sofa2.sitOn();

        table2.hasLegs();
        table2.sitOn();
    }
}

