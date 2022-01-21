package kata6;

import java.util.Scanner;
import kata6.factories.regionalfactories.AmericanCarToyFactory;
import kata6.factories.regionalfactories.AsianCarToyFactory;
import kata6.business.ToyBusiness;
import kata6.factories.ToyFactory;
import kata6.factories.regionalfactories.AmericanHelicopterToyFactory;
import kata6.factories.regionalfactories.AsianHelicopterToyFactory;

public class Kata6 {

    public static void main(String[] args) {
        ToyFactory toyFactory1 = new AsianCarToyFactory();
        ToyFactory toyFactory2 = new AsianHelicopterToyFactory();
        ToyFactory toyFactory3 = new AmericanCarToyFactory();
        ToyFactory toyFactory4 = new AmericanHelicopterToyFactory();
        
        
        ToyBusiness toyBusiness = new ToyBusiness();   
        toyBusiness.add("asianCar", toyFactory1);
        toyBusiness.add("asianHelicopter", toyFactory2);
        toyBusiness.add("americanCar", toyFactory3);
        toyBusiness.add("americanHelicopter", toyFactory4);
        
        OUTER:
        while (true) {
            System.out.println("Introduce command");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            
            if(command.equals("exit")){
                break;
            } else{
                if(toyBusiness.toyFactories.containsKey(command)){
                    toyBusiness.produceToy(command);
                } else{
                    System.out.println("Unkwown command");
                }
            } 
            
        }
    }
    
}
