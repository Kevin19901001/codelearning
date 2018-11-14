package action.chapter03.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import action.chapter03.entity.Notepad;

/**
 * Configure bean's scope by java config. Use
 * '@Scope' annotation.
 * @author Kevin
 * @since 2017-08-03
 */
@Configuration
public class NotepadPrototypeConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Notepad notepad(){
		return new Notepad();
	}
	
}
