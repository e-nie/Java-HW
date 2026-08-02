package mock_prep.OOP_tasks_1.composition_aggregation.playlists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Playlist {
    private String title;
    private List<PlaylistTrack> tracks;

    public Playlist(String title) {
        this.title = title;
        this.tracks = new ArrayList<>();
    }

    public void addSong(Song song) {
        int position = tracks.size() + 1;
        PlaylistTrack newTrack = new PlaylistTrack(song, position);
        tracks.add(newTrack);
    }

    public void removeSong(String title) {
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i).getSong().getTitle().equals(title)) {
                tracks.remove(i);
                return;
            }
        }
        System.out.println("The song was not found");
    }

    public double countTotalDuration() {
        double count = 0;
        for (PlaylistTrack track : tracks) {
            count += track.getSong().getDuration();
        }
        return count;
    }

    public void showAllSongs() {
        for (PlaylistTrack track : tracks) {
            System.out.println("Track: " + track.getPosition() + ", " + track.getSong().getTitle() +
                    ", Artist: " + track.getSong().getArtist() +
                    ", Duration: " + track.getSong().getDuration());
        }
    }

    public void changePosition(String title, int newPosition) {
        for (PlaylistTrack track : tracks) {
            if (track.getSong().getTitle().equals(title)) {
              track.changePosition(newPosition);
              tracks.sort(Comparator.comparingInt(PlaylistTrack::getPosition));
              return;
            }
        }
            System.out.println("Track wasn't found");

    }


}
