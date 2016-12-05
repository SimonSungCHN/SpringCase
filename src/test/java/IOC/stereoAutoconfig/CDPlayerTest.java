package IOC.stereoAutoconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import IOC.stereoAutoconfig.CDPlayerConfig;
import IOC.stereoAutoconfig.CompactDisc;
import IOC.stereoAutoconfig.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {


  @Autowired
  private MediaPlayer player;
  
  @Autowired
  private CompactDisc cd;
  
  @Test
  public void cdShouldNotBeNull() {
    assertNotNull(cd);
    player.play();
    cd.play();
  }


}
