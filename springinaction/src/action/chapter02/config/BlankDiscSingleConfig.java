package action.chapter02.config;

import org.springframework.context.annotation.Bean;

import action.chapter02.entity.BlankDisc;

public class BlankDiscSingleConfig {

	@Bean
	public BlankDisc blankDisc(){
		return new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles");
	}
	
}
