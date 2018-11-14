package action.chapter03.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import action.chapter03.entity.BlankDisc;
import action.chapter03.entity.CompactDisc;

@Configuration
@PropertySource("action/chapter03/property/blank_disc.properties")
public class DiscConfig {

	@Autowired
	Environment evn;
	
	@Bean
	public CompactDisc disc(){
		// evn.getProperty(String key)
		// evn.getProperty(String key, String default).
		// getProperty overload, if the property does noe exist, the default will raplace.
		return new BlankDisc(evn.getProperty("disc.title", "Rattle and Hum"), evn.getProperty("disc.artist", "U2"));
	}
	
}
