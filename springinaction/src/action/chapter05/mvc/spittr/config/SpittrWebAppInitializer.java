package action.chapter05.mvc.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import action.chapter05.mvc.spittr.config.RootConfig;
import action.chapter05.mvc.spittr.config.WebConfig;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}
	

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}
	

	@Override
	protected String[] getServletMappings() {
		return new String[]{ "/" };
	}

}
