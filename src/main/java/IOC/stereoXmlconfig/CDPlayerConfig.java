package IOC.stereoXmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IOC.stereoXmlconfig.impl.CDPlayer;
import IOC.stereoXmlconfig.impl.SgtPeppers;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer() {
    return new CDPlayer(compactDisc());
  }

}
