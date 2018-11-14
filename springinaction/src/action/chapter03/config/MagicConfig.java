package action.chapter03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import action.chapter03.condition.MagicExistsCondition;
import action.chapter03.entity.MagicBean;

public class MagicConfig {

	/**
	 * conditional bean:
	 * Annotation 'Conditional' was given an argument
	 * 'MagicExistsCondition.class'. It means if the
	 * method 'matches()' that class 'MagicExistCondition'
	 * implemented from interface 'Condition' returns ture,
	 * the bean of 'MagicBean' would be created, or the
	 * method with 'bean' annotation would be ignored.
	 * @return
	 */
	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean(){
		return new MagicBean();
	}
	
}
