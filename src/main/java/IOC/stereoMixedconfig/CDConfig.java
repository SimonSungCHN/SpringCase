package IOC.stereoMixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IOC.stereoMixedconfig.impl.SgtPeppers;

@Configuration
public class CDConfig {
	
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}