package IOC.stereoMixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IOC.stereoMixedconfig.impl.CDPlayer;
import IOC.stereoMixedconfig.impl.SgtPeppers;

@Configuration
public class CDPlayerConfig {

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
