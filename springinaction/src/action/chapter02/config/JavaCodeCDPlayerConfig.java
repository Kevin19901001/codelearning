package action.chapter02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import action.chapter02.entity.CDPlayer;
import action.chapter02.entity.CompactDisc;
import action.chapter02.entity.HardDaysNight;
import action.chapter02.entity.Resolver;
import action.chapter02.entity.SgtPeppers;
import action.chapter02.entity.WhiteAlbum;

@Configuration
public class JavaCodeCDPlayerConfig {

	// Declare simple bean.
	/*@Bean*//*(name="lonelyHeartsClunBand")*/
	/*public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}*/
	
	/**
	 * You can use evrything java supplied to
	 * define a bean.
	 * @return An instance of CompactDisc type.
	 */
	@Bean
	public CompactDisc randomBeatlesCD(){
		int choice = (int) Math.floor(Math.random() * 4);
		if(choice == 0){
			return new SgtPeppers();
		} else if (choice == 1){
			return new WhiteAlbum();
		} else if (choice == 2){
			return new HardDaysNight();
		} else {
			return new Resolver();
		}
	}
	
	
	/**
	 * Use JavaConfig to implements Dependency
	 * injection when define a bean.
	 * @return An instance of CDPlayer type
	 * 		   with a CompactDisc property.
	 */
	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(new SgtPeppers());
	}
	
	
	/**
	 * Another way to implements Dependency
	 * injection when define a bean. No matter
	 * where the CompactDisc bean is.
	 * @param compactDisc
	 * @return An instance of CDPlayer type
	 * 		   with a CompactDisc property.
	 */
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
	
}
