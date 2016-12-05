package IOC.stereoJavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IOC.stereoJavaconfig.impl.CDPlayer;
import IOC.stereoJavaconfig.impl.SgtPeppers;

@Configuration
public class CDPlayerConfig {

	// 显示声明 bean
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
