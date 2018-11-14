package action.chapter03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

import action.chapter03.entity.ShoppingCart;

/**
 * Configure bean's web session scope through
 * java config.
 * @author Kevin
 * @since 2017-08-03
 */
@Configuration
public class ShoppingCartSessionConfig {

	@Bean
	@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
	public ShoppingCart cart(){
		return new ShoppingCart();
	}
	
}
