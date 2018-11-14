package action.chapter04.entity;

import java.util.HashMap;
import java.util.Map;

//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class TrackCounter {
	
	/* This way is to use 'AspectJ' annotation to test argument transformation */
	
	//private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	/*
	@Pointcut("execution(* action.chapter04.entity.CompactDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber){
		
	}*/
	
	
	/*
	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber){
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount + 1);
	}
	*/
	
	
	/*
	public int getPlayCount(int trackNumber){
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	/* Besides 'AspectJ' annotation, xml configuration is another way. So the annotations are unnecessary: */
	
	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	public void countTrack(int trackNumber){
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount);
	}
	
	
	public int getPlayCount(int trackNumber){
		return trackCounts.containsKey(trackCounts) ? trackCounts.get(trackNumber) : 0;
	}
	
}
