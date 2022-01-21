package kata6.branches;

import kata6.business.ToyBusiness;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianCarToy;
import kata6.toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

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
        toy.pack();
        toy.label();
        return toy;
    }

}
