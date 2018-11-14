package action.chapter01.entity;

public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		super();
		this.quest = quest;
	}

	public Quest getQuest() {
		return quest;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest(){
		quest.embark();
	}
	
}
