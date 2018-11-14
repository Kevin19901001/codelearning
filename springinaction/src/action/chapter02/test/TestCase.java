package action.chapter02.test;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import action.chapter02.config.AutowiredCDPlayerConfig;
import action.chapter02.config.XmlToJavaConfigMixConfig;
import action.chapter02.entity.CompactDisc;
import action.chapter02.entity.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={/*AutowiredCDPlayerConfig.class,*/ XmlToJavaConfigMixConfig.class})
public class TestCase {
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	@Inject
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
	
	@Test
	public void play(){
		//player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles", player.play());
	}
	
	
	@Test
	public void testXmlToJavaMixConfig(){
		player.play();
	}
	
	
	@Test
	public void testJavaToXmlMixConfig(){
		player.play();
	}
	
}
