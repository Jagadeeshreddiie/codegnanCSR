package backend.Day8;
public class UseCar  {
    public static void main(String []args){
    Slavia s=new Slavia();
    s.turnDirection("right");
    s.accelerate(34);
    s.turnDirection("right");
    s.accelerate(100);
    s.sunRoof();
    s.sunRoof();
    s.stop();
    }
}
