package kata6.business;

import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;

public class ToyBusiness {
    
    ToyFactory toyFactory;
    
    public ToyBusiness(ToyFactory toyFactory){
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return toyFactory.produceToy(type);
        
    }
    
}
