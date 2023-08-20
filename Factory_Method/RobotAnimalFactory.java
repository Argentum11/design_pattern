package argentum11;
public class RobotAnimalFactory implements Factory{

    @Override
    public Product getProduct(){
        return new RobotDog();
    }

    public Product getProduct(String productName){
        if(productName == "Robot cat"){
            return new RobotCat();
        }
        else{
            return new RobotDog();
        }
    }

}