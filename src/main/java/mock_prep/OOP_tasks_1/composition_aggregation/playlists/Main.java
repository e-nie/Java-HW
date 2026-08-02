package mock_prep.OOP_tasks_1.composition_aggregation.playlists;

public class Main {
    static void main(String[] args) {
        Song song1 = new Song("Ocean", "AMK", 3.22);
        Song song2 = new Song("Ruzica", "Bjelo Dugme", 5.58);
        Song song3 = new Song("Where do I beginn", "Andy Williams", 4.12 );
        Song song4 = new Song("November Rain", "Guns'n'Roses", 8.50);
        Song song5 = new Song("Dancing with myself", "Billy Idol", 3.5);

        Playlist playlist = new Playlist("My favourite Songs");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);

        playlist.showAllSongs();
        System.out.println();

        playlist.removeSong("Ruzica");
        playlist.showAllSongs();
        System.out.println();

        playlist.changePosition("Dancing with myself",2);
        playlist.showAllSongs();
        System.out.println();

        System.out.println("Total playlist duration: " + playlist.countTotalDuration());
    }
}
