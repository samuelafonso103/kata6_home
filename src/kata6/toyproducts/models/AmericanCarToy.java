package kata6.toyproducts.models;

import kata6.componentFactories.ComponentFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.components.Engine;
import kata6.toyproducts.components.Wheel;

public class AmericanCarToy implements Toy{

    private final Integer serialNumber;
    private final String type = "car";
    private final ComponentFactory componentFactory;
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    
    public AmericanCarToy(Integer serialNumber, ComponentFactory componentFactory) {
        this.serialNumber = serialNumber;
        this.componentFactory = componentFactory;
    }

    @Override
    public void pack(){
        System.out.println("American Car with serial number " + serialNumber +  " packed");
    }
    
    @Override
    public void label(){
        System.out.println("American Car with serial number " + serialNumber +  " labeled");
    }

    @Override
    public void prepare() {
        engine = componentFactory.createEngine();
        wheel1 = componentFactory.createWheel();
        wheel2 = componentFactory.createWheel();
        wheel3 = componentFactory.createWheel();
        wheel4 = componentFactory.createWheel();
        System.out.println("American Car with serial number " + serialNumber +  " prepared");
    }

}
