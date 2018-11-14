package action.chapter02.entity;

public class HardDaysNight implements CompactDisc {

	String title;
	String artist;
	
	@Override
	public String play() {
		System.out.println("Playing " + title + " by " + artist);
		return "Playing " + title + " by " + artist;
	}
	
}
