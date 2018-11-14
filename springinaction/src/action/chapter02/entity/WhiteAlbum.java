package action.chapter02.entity;

public class WhiteAlbum implements CompactDisc {

	String title;
	String artist;
	
	@Override
	public String play() {
		System.out.println("Playing " + title + " by " + artist);
		return "Playing " + title + " by " + artist;
	}

}
