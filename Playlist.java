import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    
    ArrayList<String> desertIslandPlaylist= new ArrayList<String>();

    // add songs
    desertIslandPlaylist.add("Would You Lie");
    desertIslandPlaylist.add("Me + You");
    desertIslandPlaylist.add("Dreams Can Come True");
    desertIslandPlaylist.add("Malibu");
    desertIslandPlaylist.add("Glitch in the Simulation");
    desertIslandPlaylist.add("Way Too High");

    // print playlist
    System.out.println(desertIslandPlaylist);

    // Print size of playlist
    System.out.println(desertIslandPlaylist.size());

    // Remove a song
    desertIslandPlaylist.remove(3);
    System.out.println(desertIslandPlaylist);

    // Swap songs
    int songA= desertIslandPlaylist.indexOf("Would You Lie");
    int songB= desertIslandPlaylist.indexOf("Way Too High");
    String temp= desertIslandPlaylist.get(songA);
    desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
    desertIslandPlaylist.set(songB, temp);
    System.out.println(desertIslandPlaylist);
  }
  
}
