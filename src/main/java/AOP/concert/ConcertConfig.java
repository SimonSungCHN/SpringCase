package AOP.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan
@EnableAspectJAutoProxy    //启用AspectJ注解
public class ConcertConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}

}
