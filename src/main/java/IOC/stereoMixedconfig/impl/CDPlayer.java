package IOC.stereoMixedconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;

import IOC.stereoMixedconfig.CompactDisc;
import IOC.stereoMixedconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
