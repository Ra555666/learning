package SierraBeits.Collections16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox3 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox3().go();
    }

    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList,artistCompare);
        System.out.println(songList);
    }

    void getSongs(){
        try {
            File songList = new File("SongList2.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(songList));
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

}
