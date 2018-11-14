package action.chapter02.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc compactDisc;
	
	public CDPlayer() {
		super();
	}


	/**
	 * Autowired by constructor.
	 */
	@Autowired
	public CDPlayer(CompactDisc compactDisc) {
		super();
		this.compactDisc = compactDisc;
	}
	

	/*
	 * Autowired by setter.
	 */
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	
	/**
	 * Comment '@Autowired' can be used on any method in a class. 
	 * It is the same as constructor and setter.
	 * @param compactDisc
	 */
	/*
	@Autowired(required=false)
	public void insertCd(CompactDisc compactDisc){
		   this.compactDisc = compactDisc;
	}
	*/
	

	@Override
	public String play() {
		return compactDisc.play();
	}

}
