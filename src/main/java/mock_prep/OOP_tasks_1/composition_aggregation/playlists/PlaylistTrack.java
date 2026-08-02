package mock_prep.OOP_tasks_1.composition_aggregation.playlists;

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

    public void changePosition(int newPosition){
        this.position = newPosition;
    }
}
