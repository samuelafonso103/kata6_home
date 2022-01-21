package kata6;

import java.util.Scanner;
import kata6.toys.Car;
import kata6.toys.Helicopter;
import kata6.toys.SerialNumberGenerator;
import kata6.toys.ToyBusiness;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
                
        while(true){
            System.out.println("Introduce command");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                System.out.println("Process finished");
                break;
            } else if(command.equals("car")){
                toyBusiness.createCar();
            } else if(command.equals("helicopter")){
                toyBusiness.createHelicopter();
            } else{
                System.out.println("Command unknown!");
            }
        }
    }
    
}
