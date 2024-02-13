
public class Fortuner implements Car{
    public void turnDirection(String direction){
        System.out.println("The Fortuner is turning "+direction);
    }
    public void accelerate(int points){
        System.out.println("The Fortuner is accelerated by "+points);
    }
    public void stop(){
        System.out.println("The Fortuner is Stopped.");
    }
    public void fourWheel(boolean status){
        if(status){
            System.out.println("FourWheel drive activated");
        }
        else{
            System.out.println("FourWheel drive Deactivated");
        }
    }
}
