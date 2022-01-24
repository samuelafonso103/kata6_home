package kata6.componentFactories.regionalComponentFactories;

import kata6.componentFactories.ComponentFactory;
import kata6.toyproducts.components.Engine;
import kata6.toyproducts.components.RotorBlade;
import kata6.toyproducts.components.Wheel;
import kata6.toyproducts.components.american.AmericanEngine;
import kata6.toyproducts.components.american.AmericanRotorBlade;
import kata6.toyproducts.components.american.AmericanWheel;

public class AmericanComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        System.out.println("***American Wheel created***");
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        System.out.println("***American Engine created***");
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        System.out.println("***American RotorBlade created***");
        return new AmericanRotorBlade();
    }

}
