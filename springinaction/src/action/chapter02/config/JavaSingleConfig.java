package action.chapter02.config;

import org.springframework.context.annotation.Bean;

import action.chapter02.entity.BlankDisc;
import action.chapter02.entity.CDPlayer;

public class JavaSingleConfig {
	
	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(new BlankDisc());
	}
	
}
