package action.chapter01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.chapter01.entity.Knight;

public class TestCase {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("action/chapter01/xml/applicationContext.xml");
	
	@Test
	public void testBraveKnight(){
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
	}
	
}
