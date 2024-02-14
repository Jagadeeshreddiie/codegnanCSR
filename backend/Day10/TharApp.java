public class TharApp {
    public static void main(String []args){
        Car1 c=new Thar();
        MediaPlayer m=new Thar();
        c.accelerate(20);
        c.turnDirection("right");
        m.start(1);
        m.pause(0);
        c.stop();
        m.off();
        new Thar().sample();
        System.out.println("End of the program.");
    }
}
