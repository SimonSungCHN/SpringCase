package IOC.stereoMixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//整合
@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:IOC/stereoMixedconfig/cd-config.xml")
public class SoundSystemConfig {

}
