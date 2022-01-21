package kata6;

import java.util.Scanner;
import kata6.branches.AmericanToyBusiness;
import kata6.branches.AsianToyBusiness;
import kata6.toyproducts.models.AsianCarToy;
import kata6.toyproducts.models.AmericanHelicopterToy;
import kata6.business.SerialNumberGenerator;
import kata6.business.ToyBusiness;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new AsianToyBusiness();
                
        OUTER:
        while (true) {
            System.out.println("Introduce command");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            switch (command) {
                case "exit":
                    System.out.println("Process finished");
                    break OUTER;
                case "car":
                    toyBusiness.createToy(command);
                    break;
                case "helicopter":
                    toyBusiness.createToy(command);
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        }
    }
    
}
