package SierraBeits.Collections16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs(){
        try {
            File songList = new File("SongList.txt");
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
        String[] authorAndSong = lineToParse.split("/");
        songList.add(authorAndSong[1]);
    }
}
