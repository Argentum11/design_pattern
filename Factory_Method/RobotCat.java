package argentum11;
public class RobotCat implements Product{
    String name = "Graystripe";

    protected RobotCat(){}

    protected RobotCat(String name){
        this.name = name;
    }

    @Override
    public void outputProductDetails(){
        System.out.println(String.format("Purr! " + 
        "Prepare to delve into the perils and mysteries " + 
        "of the jungle alongside the mightiest warrior, %s!", name));
    }
}