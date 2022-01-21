package kata6.toyproducts.models;

import kata6.toyproducts.Toy;

public class AmericanHelicopterToy implements Toy{
    private final Integer serialNumber;
    private final String type = "helicopter";
    
    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("American Helicopter with serial number " + serialNumber +  " packed");
    }
    
    @Override
    public void label(){
        System.out.println("American Helicopter with serial number " + serialNumber +  " labeled");
    }
}
