package AdapterPatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play (String audioType, String fileName)
    {
        if (audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file. Name: "+fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
        {
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else System.out.println("Invalid media. Type "+audioType+" not supported!");
    }
}
