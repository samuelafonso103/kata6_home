package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber);
    }

}
