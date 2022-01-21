package kata6.toys;

public class ToyBusiness {
    private final SerialNumberGenerator sng = new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(sng.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(sng.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}
