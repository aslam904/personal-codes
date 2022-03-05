package aslam;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;
    public Album(String name,String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }
    //we are creating a song in this method
    public boolean addSong(String title,double duration){
        if(findSong(title)==null){
            songs.add(new Song(title,duration));
            return true;
        }else{
            return false;
        }
    }
    public Song findSong(String title){
        for(int i=0;i< songs.size();i++){
            Song song=songs.get(i);
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int track, LinkedList<Song> playlist){
        int index=track-1;
        if(index>=0 && index<= songs.size()){
            playlist.add(songs.get(index));
            return true;
        }else{
            return false;
        }
    }
    public boolean addToPlayList(String title,LinkedList<Song> songs){
        Song song=findSong(title);
        if(song!=null){
            songs.add(song);
            return true;
        }else{
            return false;
        }
    }
}

