package IOC.stereoJavaconfig.impl;

import IOC.stereoJavaconfig.CompactDisc;
import IOC.stereoJavaconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
	
  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
