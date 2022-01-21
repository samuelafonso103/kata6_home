package kata6.business;

import java.util.HashMap;
import java.util.Map;
import kata6.factories.SerialNumberGenerator;
import kata6.factories.ToyFactory;
import kata6.toyproducts.Toy;

public class ToyBusiness {
    public final SerialNumberGenerator sng = new SerialNumberGenerator();
    public Map<String, ToyFactory> toyFactories = new HashMap<String, ToyFactory>();
    
    public Toy produceToy(String name){
        ToyFactory factory = toyFactories.get(name);
        return factory.produceToy(sng.next());
        
    }
    
    public void add(String name, ToyFactory toyFactory){
        toyFactories.put(name, toyFactory);
    }
    
}
