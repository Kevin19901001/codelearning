package action.chapter01.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * wiring based on java
 * @author Kevin
 * @since 2017-07-25
 * @version 1.0
 */
@Configuration
public class KnightConfig {

	@Bean
	public Quest quest() {
		
		return new SlayDragonQuest(System.out);
	}
	
	@Bean
	public Knight knight(){
		
		return new BraveKnight(quest());
	}
	
}
