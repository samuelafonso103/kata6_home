package kata6.toys;

public class Car {
    private final Integer serialNumber;
    private final String type = "car";
    
    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("Car with serial number " + serialNumber +  " packed");
    }
    
    public void label(){
        System.out.println("Car with serial number " + serialNumber +  " labeled");
    }
}
