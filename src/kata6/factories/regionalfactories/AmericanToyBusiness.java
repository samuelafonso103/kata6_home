package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanCarToy;
import kata6.toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyFactory{


    @Override
    public Toy createToy(String type) {
        Toy toy = null;
        switch(type){
            case "car":
                toy = new AmericanCarToy(sng.next());
                break;
                
            case "helicopter":
                toy = new AmericanHelicopterToy(sng.next());
                break;
                
            default:
                return null;
        }
        return toy;
    }

}
