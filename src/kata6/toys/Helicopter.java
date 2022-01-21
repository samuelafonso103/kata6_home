package kata6.toys;

public class Helicopter {
    private final Integer serialNumber;
    private final String type = "helicopter";
    
    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("Helicopter with serial number " + serialNumber +  " packed");
    }
    
    public void label(){
        System.out.println("Helicopter with serial number " + serialNumber +  " labeled");
    }
}
