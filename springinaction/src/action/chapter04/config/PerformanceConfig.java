package action.chapter04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import action.chapter04.entity.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class PerformanceConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
	
}
