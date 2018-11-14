package action.chapter01.entity;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		super();
		this.stream = stream;
	}
	
	public PrintStream getStream() {
		return stream;
	}

	public void setStream(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}

}
