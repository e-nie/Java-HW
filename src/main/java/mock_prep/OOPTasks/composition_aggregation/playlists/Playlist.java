package mock_prep.OOPTasks.composition_aggregation.playlists;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String title;
    private List<PlaylistTrack> tracks;

    public Playlist(String title) {
        this.title = title;
        this.tracks = new ArrayList<>();
    }

    public void addSong(Song song) {
        PlaylistTrack newTrack = new PlaylistTrack(song, tracks.size() + 1);
        tracks.add(newTrack);
    }

    public void removeSong(String title) {
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i).getSong().getTitle().equals(title)) {
                tracks.remove(i);
                return;
            }
        }
    }

    public int calculateTotalPlaylistDuration() {
        int totalDuration = 0;
        for (PlaylistTrack track : tracks) {
            totalDuration += track.getSong().getDurationSeconds();
        }
        return totalDuration;
    }

    public void showSongs() {
        for (PlaylistTrack track : tracks) {
            System.out.println(track);
        }
    }
}

