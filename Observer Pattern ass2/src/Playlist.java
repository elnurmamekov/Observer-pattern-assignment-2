public interface Playlist {
    void join(MusicLover musicLover);
    void remove(MusicLover musicLover);
    void notifyAllUsers();
}
