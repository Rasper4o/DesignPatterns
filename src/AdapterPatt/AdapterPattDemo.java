package AdapterPatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class AdapterPattDemo {

    public static void main (String[] args)
    {
        AudioPlayer audioPlayer=new AudioPlayer();

        audioPlayer.play("mp4", "LostOnYou");
        audioPlayer.play("mp3", "Riders on the Storm");
        audioPlayer.play("vlc", "Yes Man");
    }

}
