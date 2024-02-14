public class Thar implements Car1, MediaPlayer {
    boolean power = false;

    public void turnDirection(String direction) {
        System.out.println("Turned " + direction + " side");
    }

    public void accelerate(int points) {
        System.out.println("Accelerated by " + points);
    }

    public void stop() {
        System.out.println("The car has stopped");
    }

    public void start() {
        System.out.println("The music is started");
    }

    public void pause() {
        System.out.println("The music is Paused");

    }

    public void power() {
        power = !power;
        if (power) {
            System.out.println("The Music Player is ON");
        } else {
            System.out.println("The Music Player is OFF");
        }
    }

    void sample() {
        System.out.println("hello this is sample");
    }
}
