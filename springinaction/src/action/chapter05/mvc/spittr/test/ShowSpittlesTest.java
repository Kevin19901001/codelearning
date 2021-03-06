package action.chapter05.mvc.spittr.test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import action.chapter05.mvc.spittr.data.SpittleRepository;
import action.chapter05.mvc.spittr.entity.Spittle;
import action.chapter05.mvc.spittr.web.SpittleController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class ShowSpittlesTest {

	@Test
	public void sholdShowRecentSpittles() throws Exception {
		List<Spittle> expectedSpittles = createSpittleList(20);
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
		SpittleController controller = new SpittleController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
		mockMvc.perform(get("/spittles")).andExpect(view().name("spittles")).andExpect(model().attributeExists("spittleList")).andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
	}
	
	
	@Test
	public void shouldShowPagedSpittles() throws Exception {
		List<Spittle> expectedSpittles = createSpittleList(50);
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		when(mockRepository.findSpittles(238900, 50)).thenReturn(expectedSpittles);
		SpittleController controller = new SpittleController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
		mockMvc.perform(get("/spittles?max=238900&count=50")).andExpect(view().name("spittle")).andExpect(model().attributeExists("spittleList")).andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
	}
	
	
	private List<Spittle> createSpittleList(int count){
		List<Spittle> spittles = new ArrayList<Spittle>();
		for(int i = 0; i < count; i++){
			spittles.add(new Spittle("Spittle " + i, new Date()));
		}
		return spittles;
	}
	
}
