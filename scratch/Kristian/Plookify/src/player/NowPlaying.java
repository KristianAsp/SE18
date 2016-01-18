package player;

import java.util.ArrayList;

public class NowPlaying {
    ArrayList<Track> nowPlaying = null;
    
    public NowPlaying(ArrayList<Track> nowPlaying){
        this.nowPlaying = nowPlaying;
    }
    
    public ArrayList<Track> getPlaying(){
        return nowPlaying;
    }
}
