package kata6.toyproducts.models;

import kata6.componentFactories.ComponentFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.components.Engine;
import kata6.toyproducts.components.RotorBlade;

public class AsianHelicopterToy implements Toy{

    private final Integer serialNumber;
    private final String type = "helicopter";
    private final ComponentFactory componentFactory;
    private Engine engine;
    private RotorBlade rotorBlade;
    
    
    public AsianHelicopterToy(Integer serialNumber, ComponentFactory componentFactory) {
        this.serialNumber = serialNumber;
        this.componentFactory = componentFactory;
    }

    @Override
    public void pack(){
        System.out.println("Asian Helicopter with serial number " + serialNumber +  " packed");
    }
    
    @Override
    public void label(){
        System.out.println("Asian Helicopter with serial number " + serialNumber +  " labeled");
    }
    
    @Override
    public void prepare() {
        engine = componentFactory.createEngine();
        rotorBlade = componentFactory.createRotorBlade();
        System.out.println("Asian Helicopter with serial number " + serialNumber +  " prepared");
    }

}
