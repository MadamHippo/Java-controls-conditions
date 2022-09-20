import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Baby");
    desertIslandPlaylist.add("Poop");
    desertIslandPlaylist.add("Vomit");
    desertIslandPlaylist.add("Painful");
    desertIslandPlaylist.add("Tired");
    desertIslandPlaylist.add("Angelic");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(1);
    System.out.println(desertIslandPlaylist.size());

    // swapping items:
    int indexA = desertIslandPlaylist.indexOf("Baby");
    int indexB = desertIslandPlaylist.indexOf("Angelic");
    String tempA = "Baby";
    desertIslandPlaylist.set(indexA, "Angelic");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);



  }
  
}
