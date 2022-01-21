package kata6.toyproducts.models;

import kata6.toyproducts.Toy;

public class AmericanCarToy implements Toy{

    private final Integer serialNumber;
    private final String type = "car";
    
    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void pack(){
        System.out.println("American Car with serial number " + serialNumber +  " packed");
    }
    
    @Override
    public void label(){
        System.out.println("American Car with serial number " + serialNumber +  " labeled");
    }

}
