package kata6.factories;

import kata6.toyproducts.Toy;

public abstract class ToyFactory {
    public final SerialNumberGenerator sng = new SerialNumberGenerator();
    
    public Toy produceToy(String type) {
        Toy toy = createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(String type);
}
