package kata6.factories;

public class SerialNumberGenerator {
    private static SerialNumberGenerator serialNumberGenerator = null;
    private Integer serialNumber;

    private SerialNumberGenerator() {
        serialNumber = 0;
    }
    
    public static SerialNumberGenerator getInstance(){
        if(SerialNumberGenerator.serialNumberGenerator == null){
           SerialNumberGenerator.serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
    
    public Integer next(){
        serialNumber += 1;
        return serialNumber;
    }

}
 