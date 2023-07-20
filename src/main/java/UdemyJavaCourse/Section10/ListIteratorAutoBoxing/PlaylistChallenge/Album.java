package UdemyJavaCourse.Section10.ListIteratorAutoBoxing.PlaylistChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String title , double duration){
        if (findSong(title)!= null){
            return false;
        }
        Song newSong = new Song(title , duration);
        songs.add(newSong);
        return true;
    }
    public boolean addToPlayList(int trackNumber , LinkedList<Song> playList){
        if (trackNumber <=0 || trackNumber > songs.size()){
            return false;
        }
        Song songToAdd = songs.get(trackNumber-1);
        String songToAddTitle = songToAdd.getTitle();
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }

        playList.add(songToAdd);
        return true;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        //verify the song exists
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            // The song was not found
            return false;
        }
        // Check if the song is already in the playList
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                // The song is already in the playlist
                return false;
            }
        }

        // Add the song to the end of the playList.
        playList.add(songToAdd);
        return true;
    }

    private Song findSong(String titleOfSong){
            for (Song s: songs) {
                if (s.getTitle().equals(titleOfSong)){
                    return s;
                }
            }
        return null;
    }
}
class Song{
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
       return String.format("%s: %f" , title , duration);
    }
}
