package action.chapter03.entity;

public class BlankDisc implements CompactDisc {
	
	private String title;
	private String artist;
	
	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
		System.out.println("construct completed.");
	}
	

	public String getTitle() {
		return title;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getArtist() {
		return artist;
	}
	

	public void setArtist(String artist) {
		this.artist = artist;
	}
	

	@Override
	public void play() {
		System.out.println(artist + " is playing " + title);
	}

}
