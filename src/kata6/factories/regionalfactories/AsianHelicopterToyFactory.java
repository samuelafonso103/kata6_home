package kata6.factories.regionalfactories;

import kata6.componentFactories.ComponentFactory;
import kata6.componentFactories.regionalComponentFactories.AsianComponentFactory;
import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{

    private final ComponentFactory componentFactory = new AsianComponentFactory();
    
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianHelicopterToy(serialNumber, componentFactory);
    }
}
