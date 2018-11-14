package action.chapter03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import action.chapter03.entity.Cake;
import action.chapter03.entity.Cookies;
import action.chapter03.entity.Dessert;
import action.chapter03.entity.IceCream;
import action.chapter03.entity.Snack;

@Configuration
public class SnacksJavaConfig {

	@Bean
	@Primary
	public Dessert iceCream(){
		return new IceCream();
	}
	
	
	@Bean
	public Dessert cookies(){
		return new Cookies();
	}
	
	
	@Bean
	public Dessert cake(){
		return new Cake();
	}
	
	
	@Bean
	public Snack snack(){
		return new Snack();
	}
	
}
