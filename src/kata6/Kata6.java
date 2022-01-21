package kata6;

import java.util.Scanner;
import kata6.factories.regionalfactories.AmericanToyBusiness;
import kata6.factories.regionalfactories.AsianToyBusiness;
import kata6.business.ToyBusiness;
import kata6.factories.ToyFactory;

public class Kata6 {

    public static void main(String[] args) {
        ToyFactory toyFactory = new AsianToyBusiness();
        ToyBusiness toyBusiness = new ToyBusiness(toyFactory);        
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
                    toyBusiness.produceToy(command);
                    break;
                case "helicopter":
                    toyBusiness.produceToy(command);
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        }
    }
    
}
