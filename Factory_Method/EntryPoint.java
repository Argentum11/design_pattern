package argentum11;

import argentum11.RobotAnimalFactory;

public class EntryPoint {
    public static void main(String[] args){
        Factory robotAnimalFactory = new RobotAnimalFactory();
        
        Product firstAnimal = robotAnimalFactory.getProduct();
        Product secondAnimal = ((RobotAnimalFactory)robotAnimalFactory).getProduct("Robot cat");

        firstAnimal.outputProductDetails();
        secondAnimal.outputProductDetails();
    }
}
