package mock_prep.OOPTasks.composition_aggregation.playlists;

public class PlaylistTrack {
    private Song song;
    private int position;

    public PlaylistTrack(Song song, int position) {
        this.song = song;
        this.position = position;
    }

    public Song getSong() {
        return song;
    }

    public int getPosition() {
        return position;
    }

    public void changePosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return song.getTitle() + " - artist: " + song.getArtist() + ", duration: " + song.getDurationSeconds();
    }
}
