package kata6.factories.regionalfactories;

import kata6.componentFactories.ComponentFactory;
import kata6.componentFactories.regionalComponentFactories.AmericanComponentFactory;
import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory{

    private final ComponentFactory componentFactory = new AmericanComponentFactory();
   
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanHelicopterToy(serialNumber, componentFactory);
    }
    
}
