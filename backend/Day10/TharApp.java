public class TharApp {
    public static void main(String []args){
        Car1 c=new Thar();
        MediaPlayer m=new Thar();
        m.power();
        c.accelerate(20);
        c.turnDirection("right");
        m.start();
        m.pause();
        c.stop();
        m.power();
        new Thar().sample();
        System.out.println("End of the program.");
    }
}
