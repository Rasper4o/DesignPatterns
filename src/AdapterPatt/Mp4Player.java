package AdapterPatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc (String fileName)
    {

    }

    @Override
    public void playMp4(String fileName)
    {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
