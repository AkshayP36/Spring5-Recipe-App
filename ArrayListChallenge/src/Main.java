import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("Album Name1","Arijit");
        album.addSong("Song1", 4.22);
        album.addSong("Song11", 4.22);
        album.addSong("Song21", 4.22);
        album.addSong("Song31", 4.22);
        album.addSong("Song41", 4.22);
        album.addSong("Song51", 4.22);
        album.addSong("Song61", 4.22);
        album.addSong("Song71", 4.22);
        albums.add(album);

        Album latestAlbum = new Album("Album Name2","Rahat");
        latestAlbum.addSong("Song101", 4.22);
        latestAlbum.addSong("Song110", 4.22);
        latestAlbum.addSong("Song210", 4.22);
        latestAlbum.addSong("Song310", 4.22);
        latestAlbum.addSong("Song410", 4.22);
        latestAlbum.addSong("Song510", 4.22);
        latestAlbum.addSong("Song610", 4.22);
        latestAlbum.addSong("Song710", 4.22);
        albums.add(latestAlbum);

        LinkedList<Song> playList = new LinkedList<Song>();
        almums.get(0).addToPlayList("You can'w do it right" , playList);
        
}
