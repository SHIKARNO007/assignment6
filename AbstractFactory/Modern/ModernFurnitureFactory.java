package AbstractFactory.Modern;//package ArtDeco;

import AbstractFactory.Chair;
import AbstractFactory.CoffeeTable;
import AbstractFactory.Companies;
import AbstractFactory.Sofa;

public class ModernFurnitureFactory implements Companies {
    @Override
    public Chair getChair(){
        return new ModernChair();
    }
    @Override
    public CoffeeTable getTable(){
        return new ModernCoffeeTable();
    }
    @Override
    public Sofa getSofa(){
        return new ModernSofa();
    }
}
