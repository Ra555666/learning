package SierraBeits.Collections16;

public class Song implements Comparable<Song> {
    private String titleSong;
    private String artist;
    private String rating;
    private String bpm;

    public int compareTo(Song song){
        return titleSong.compareTo(song.getTitleSong());
    }

    Song(String t, String a, String r, String b){
        this.titleSong = t;
        this.artist = a;
        this.rating = r;
        this.bpm = b;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString(){
        return titleSong;
    }
}
