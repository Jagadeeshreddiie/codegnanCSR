public class Thar implements Car1,MediaPlayer{
    public void turnDirection(String direction){
        System.out.println("Turned "+direction+" side");
    }
    public void accelerate(int points){
        System.out.println("Accelerated by "+points);
    }
    public void stop(){
        System.out.println("The car has stopped");
    }
    public void start(int choice){
        if(choice==1){
            System.out.println("The music is started");
        }
    }
    public void pause(int choice){
        if(choice==0){
            System.out.println("The music is Paused");
        }
    }
    public void off(){
        System.out.println("The music is stopped");
    }
    void sample(){
        System.out.println("hello this is sample");
    }
}
