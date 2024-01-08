public class Music
{
        String   song;
        String playlist;
        int volumelevel
        String state;
        boolean isShuffled;


    Music( String   song,String playlist,int volumelevel,String state,boolean isShuffled)
           {
            this.song = song;
            this.playlist = playList;
            this.volumeLevel = volumeLevel;
            this.state = state;
            this.isShuffled = isShuffled;
           }

   public void display()
      {
       System.out.println("song:"+song);
       System.out.println(" playList:"+ playList);
      System.out.println("volumeLevel:"+volumeLevel);
      System.out.println("state:"+state);
      System.out.println("isShuffled:"+isShuffled);
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