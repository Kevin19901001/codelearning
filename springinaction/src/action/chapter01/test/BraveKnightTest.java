package action.chapter01.test;

import org.junit.Test;
import static org.mockito.Mockito.*;

import action.chapter01.entity.BraveKnight;
import action.chapter01.entity.Quest;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
	
}
