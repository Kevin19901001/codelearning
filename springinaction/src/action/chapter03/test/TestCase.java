package action.chapter03.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import action.chapter03.config.DiscConfig;
//import action.chapter03.config.SnacksComponentConfig;
import action.chapter03.entity.CompactDisc;
//import action.chapter03.entity.Snack;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DiscConfig.class)
public class TestCase {
	
	//@Autowired
	//Snack snack;

	@Autowired
	CompactDisc disc;
	
	/*
	@Test
	public void snackShoulsNotBeNull(){
		assertNotNull(snack);
	}
	*/
	
	
	/*
	@Test
	public void testHavingSnacks(){
		snack.haveSnacks();
	}
	*/
	
	
	@Test
	public void discShouldNotBeNull(){
		assertNotNull(disc);
	}
	
	
	@Test
	public void testOuterValue(){
		disc.play();
	}
	
	
}
