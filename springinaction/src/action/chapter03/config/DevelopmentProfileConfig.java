package action.chapter03.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * Configure profile bean:
 * In java config, we can use '@Profile' annotation
 * to designate which profile a bean belongs to.
 * This config class define a profile through
 * 'EmbeddedDatabaseBuilder'. 
 * @author Administrator
 * @since 2017-07-31
 */
@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

	/**
	 * The annotation '@Profile("dev")' means that
	 * it is only in the situation that dev profile
	 * is active, thw bean will be created, or the
	 * method with '@Bean' annotation would be ingnored.
	 * @return
	 */
	@Bean(destroyMethod="shutdown")
	public DataSource dataSource(){
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
	}
	
}
