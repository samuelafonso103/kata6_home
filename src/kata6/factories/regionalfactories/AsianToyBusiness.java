package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianCarToy;
import kata6.toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyFactory{
    
    @Override
    public Toy createToy(String type) {
        Toy toy = null;
        switch(type){
            case "car":
                toy = new AsianCarToy(sng.next());
                break;
                
            case "helicopter":
                toy = new AsianHelicopterToy(sng.next());
                break;
                
            default:
                return null;
        }
        return toy;
    }

}
