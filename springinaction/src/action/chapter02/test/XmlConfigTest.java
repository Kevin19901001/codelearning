package action.chapter02.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.chapter02.entity.CDPlayer;
import action.chapter02.entity.MediaPlayer;

public class XmlConfigTest {

	ApplicationContext context = new ClassPathXmlApplicationContext("action/chapter02/xml/applicationContext.xml");
	MediaPlayer cdPlayer = context.getBean(CDPlayer.class);
	
	@Test
	public void testRefInjection(){
		MediaPlayer cdPlayer = context.getBean(CDPlayer.class);
		cdPlayer.play();
	}
	
	
	@Test
	public void testLiteralInjection(){
		MediaPlayer cdPlayer = context.getBean(CDPlayer.class);
		cdPlayer.play();
	}
	
	
	@Test
	public void testLiteralListInjection(){
		cdPlayer.play();
	}
	
	
	@Test
	public void testPropertiesInjection(){
		cdPlayer.play();
	}
	
	
	@Test
	public void testPNamespacePropertyInjection(){
		cdPlayer.play();
	}
	
	
	@Test
	public void testLiteralPropertiesInjection(){
		cdPlayer.play();
	}
	
	
	@Test
	public void testUtilNamespace(){
		cdPlayer.play();
	}
	
}
