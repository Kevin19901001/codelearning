package action.chapter02.entity;

import java.util.List;

import action.chapter02.entity.CompactDisc;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc() {
		super();
	}


	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	
	public BlankDisc(String title, String artist, List<String> tracks) {
		super();
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
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


	public List<String> getTracks() {
		return tracks;
	}


	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}


	@Override
	public String play() {
		System.out.println("Playing " + title + " by " + artist);
		for(String track : tracks){
			System.out.println("-Track: " + track);
		}
		return "Playing " + title + " by " + artist;
	}

}
