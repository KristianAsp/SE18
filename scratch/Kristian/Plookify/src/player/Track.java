package player;

public class Track {
    int duration;
    String name;
    String artist;
    String genre;
    
    public Track(int duration, String name, String artist, String genre){
        this.duration = duration;
        this.name = name;
        this.artist = artist; 
        this.genre = genre;
    }
    
    public int getDuration(){
        return duration;
    }
    
    public String getName(){
        return name;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getGenre(){
        return genre;
    }
}
