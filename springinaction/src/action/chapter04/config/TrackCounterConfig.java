package action.chapter04.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import action.chapter04.entity.BlankDisc;
import action.chapter04.entity.CompactDisc;
import action.chapter04.entity.TrackCounter;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	
	@Bean
	public CompactDisc sgtPeppers(){
		BlankDisc cd = new BlankDisc();
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
		cd.setTitle("The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		cd.setTracks(tracks);
		return cd;
	}
	
	
	@Bean
	public TrackCounter tracCounter(){
		return new TrackCounter();
	}
	
}
