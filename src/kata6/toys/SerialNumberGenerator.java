package kata6.toys;

public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    
    public Integer next(){
        serialNumber+=1;
        return serialNumber;
        
    }

}
