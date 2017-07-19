package AdapterPatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName)
    {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playMp4 (String fileName)
    {

    }

}
