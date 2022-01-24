package kata6.componentFactories;

import kata6.toyproducts.components.Engine;
import kata6.toyproducts.components.RotorBlade;
import kata6.toyproducts.components.Wheel;

public abstract class ComponentFactory {
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
    
}
