package kata6.branches;

import kata6.business.ToyBusiness;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanCarToy;
import kata6.toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{

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
        toy.pack();
        toy.label();
        return toy;
    }

}
