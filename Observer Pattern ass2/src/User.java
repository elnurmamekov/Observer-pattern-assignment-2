import java.util.List;

public class User implements MusicLover{
    String nickname;

    public User(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void update(String music) {
        System.out.println("Hey, " + nickname + "!\n" +
                "Do not skip new music. Rate it now :) \n" +
                "Music: " + music);
    }
}
