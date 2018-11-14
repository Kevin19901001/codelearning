package action.chapter04.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import action.chapter04.config.TrackCounterConfig;
import action.chapter04.entity.CompactDisc;
import action.chapter04.entity.TrackCounter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void testTrackCounter(){
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(7);
		cd.playTrack(7);
		
		assertEquals(1, counter.getPlayCount(1));
		assertEquals(1, counter.getPlayCount(2));
		assertEquals(4, counter.getPlayCount(3));
		assertEquals(0, counter.getPlayCount(4));
		assertEquals(0, counter.getPlayCount(5));
		assertEquals(0, counter.getPlayCount(6));
		assertEquals(2, counter.getPlayCount(7));
	}
	
}
