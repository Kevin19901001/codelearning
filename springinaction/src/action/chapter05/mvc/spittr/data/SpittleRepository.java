package action.chapter05.mvc.spittr.data;

import java.util.List;

import action.chapter05.mvc.spittr.entity.Spittle;

public interface SpittleRepository {

	List<Spittle> findSpittles(long max, int count);
	
}
