package IOC.stereoAutoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//注： @ComponentScan 要和 @Component 一起有
@ComponentScan       //扫描 CDPlayerConfig 所在的pacgage以及子包
//@ComponentScan(basePackageClasses={MediaPlayer.class, CompactDisc.class})  //扫描class所在的pacgage以及子包
//@ComponentScan(basePackages={"IOC.stereoAutoconfig","IOC.stereoAutoconfig.impl"}) //扫描对应包及子包
public class CDPlayerConfig { 
}
