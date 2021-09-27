import java.util.ArrayList;
import java.util.List;

public class MusicChannel implements Playlist{
    private String channelName;
    List<String> musics = new ArrayList<>();
    List<MusicLover> musicLovers = new ArrayList<>();

    public MusicChannel(String channelName) {
        this.channelName = channelName;
    }

    public void addMusic(String music){
        musics.add(music);
        notifyAllUsers();
    }

    public void removeMusic(String music){
        musics.remove(music);
        notifyAllUsers();
    }

    public void findMusic(String music){
        for(String foundMusic: musics){
            if(foundMusic.equals(music)){
                System.out.println("Searched music is: " + foundMusic);
            }else
                System.out.println("Music was not found.");
        }
    }

    @Override
    public void join(MusicLover musicLover) {
        musicLovers.add(musicLover);
    }

    @Override
    public void remove(MusicLover musicLover) {
        musicLovers.remove(musicLover);
    }

    @Override
    public void notifyAllUsers() {
        for(MusicLover musicLover: musicLovers){
            musicLover.update(musics.get(musics.size()-1));
        }
    }
}
