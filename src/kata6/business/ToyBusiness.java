package kata6.business;

import kata6.toyproducts.Toy;

public abstract class ToyBusiness {
    public final SerialNumberGenerator sng = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
}
