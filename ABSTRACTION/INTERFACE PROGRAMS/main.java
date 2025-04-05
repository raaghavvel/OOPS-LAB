
interface Camera {
    void takePhoto();
    default void recordVideo() {
        System.out.println("Recording video in 1080p");
    }
}


interface MusicPlayer {
    void playMusic();
    default void pauseMusic() {
        System.out.println("Music paused");
    }
}


class Smartphone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking a photo");
    }
    

    public void playMusic() {
        System.out.println("Playing music");
    }
    

    
    public void recordVideo() {
        System.out.println("Recording video in 4K");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();

        myPhone.takePhoto();
        myPhone.recordVideo();
        
        myPhone.playMusic();
        myPhone.pauseMusic();
    }
}