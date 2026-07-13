package mock_prep.OOPTasks.composition_aggregation.playlists;

public class Main {
    static void main(String[] args) {
        Song song1 = new Song("Ozean", "AMK", 300);
        Song song2 = new Song("Lass uns kreisen", "AMK", 400);
        Song song3 = new Song("Bohemian Rhapsody", "Queen", 500);
        Song song4 = new Song("Spin of the Wheel", "George Michael", 600);


        Playlist playlist = new Playlist("My Faves");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.showSongs();
        System.out.println();

        playlist.removeSong("Ozean");
        playlist.showSongs();
        System.out.println();

        System.out.println(playlist.calculateTotalPlaylistDuration());
    }
}
