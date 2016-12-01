package IOC.stereoXmlconfig.impl;


import IOC.stereoXmlconfig.CompactDisc;
import IOC.stereoXmlconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
