package argentum11;
public class RobotDog implements Product{
    String name = "Oberon";

    protected RobotDog(){}

    protected RobotDog(String name){
        this.name = name;
    }

    @Override
    public void outputProductDetails(){
        System.out.println(String.format("Bark! Bark! My name is %s, I am a robot dog", name));
    }
}