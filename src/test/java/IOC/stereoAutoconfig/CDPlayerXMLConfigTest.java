package IOC.stereoAutoconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import IOC.stereoAutoconfig.CompactDisc;
import IOC.stereoAutoconfig.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:IOC/stereoAutoconfig/soundsystem.xml")
public class CDPlayerXMLConfigTest {

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
  
  /*@Test
  public void play() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", 
        log.getLog());
  }*/

}
