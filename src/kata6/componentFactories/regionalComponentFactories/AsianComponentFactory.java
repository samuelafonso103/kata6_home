package kata6.componentFactories.regionalComponentFactories;

import kata6.componentFactories.ComponentFactory;
import kata6.toyproducts.components.Engine;
import kata6.toyproducts.components.RotorBlade;
import kata6.toyproducts.components.Wheel;
import kata6.toyproducts.components.asian.AsianEngine;
import kata6.toyproducts.components.asian.AsianRotorBlade;
import kata6.toyproducts.components.asian.AsianWheel;

public class AsianComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        System.out.println("***Asian Wheel created***");
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        System.out.println("***Asian Engine created***");
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        System.out.println("***Asian RotorBlade created***");
        return new AsianRotorBlade();
    }

}
