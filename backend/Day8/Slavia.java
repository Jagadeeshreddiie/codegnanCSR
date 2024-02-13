// Slavia having sunroof as concrete class

package backend.Day8;


// import backend.Day8.*;
public class Slavia implements Car{
    public void turnDirection(String direction){
        System.out.println("The Slavia is turning "+direction);
    }
    public void accelerate(int points){
        System.out.println("The Slavia is accelerated by "+points);
    }
    public void stop(){
        System.out.println("The Slavia is Stopped.");
    }
    public void sunRoof(){
        boolean sr=false;
        if(!sr){
            System.out.println("Sunroof is opening");
        }
        else{
            System.out.println("Sunroof is closing");
        }
        sr=!sr;
        // sr=!sr;
    }
}
