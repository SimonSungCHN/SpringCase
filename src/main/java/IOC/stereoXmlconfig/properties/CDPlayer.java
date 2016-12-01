package IOC.stereoXmlconfig.properties;



import IOC.stereoXmlconfig.CompactDisc;
import IOC.stereoXmlconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
