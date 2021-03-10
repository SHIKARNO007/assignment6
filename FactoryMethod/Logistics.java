package FactoryMethod;

public class Logistics {
    void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }

    Transport createTransport(){
        return null;
    }
}

