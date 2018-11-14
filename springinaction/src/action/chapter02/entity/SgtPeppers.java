package action.chapter02.entity;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public String play() {
		System.out.println("Playing " + title + " by " + artist);
		return "Playing " + title + " by " + artist;
	}

}
