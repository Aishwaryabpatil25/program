public class Music
{
        String   song;
        String playlist;
        int volumelevel
        String state;
        boolean isShuffled;
        String type;
        
     


    Music( String   song,String playlist,int volumelevel,String state,boolean isShuffled, String type)
           {
            this.song = song;
            this.playlist = playList;
            this.volumeLevel = volumeLevel;
            this.state = state;
            this.isShuffled = isShuffled;
            this.type = type;
           }

   public void display()
      {
       System.out.println("song:"+song);
       System.out.println(" playList:"+ playList);
      System.out.println("volumeLevel:"+volumeLevel);
      System.out.println("state:"+state);
      System.out.println("isShuffled:"+isShuffled);
      System.out.println("type:"+type);
    }

static void play()
{
System.out.println("song is playing");
}
static void pause()
{
System.out.println("song is paused");
}

static void skip()
{

System.out.println("song is skiped");

  }
}