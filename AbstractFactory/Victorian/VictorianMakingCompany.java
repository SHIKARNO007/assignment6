package AbstractFactory.Victorian;

import AbstractFactory.Chair;
import AbstractFactory.CoffeeTable;
import AbstractFactory.Companies;
import AbstractFactory.Sofa;
public class VictorianMakingCompany implements Companies {
    @Override
    public Chair getChair(){
        return new VictorianChair();
    }
    @Override
    public CoffeeTable getTable(){
        return new VictorianCoffeeTable();
    }
    @Override
    public Sofa getSofa(){
        return new VictorianSofa();
    }
}
