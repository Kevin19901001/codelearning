package action.chapter03.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import action.chapter03.annotation.Cold;
import action.chapter03.annotation.Creamy;

@Component
public class Snack {
	
	private Dessert dessert;


	public Dessert getDessert() {
		return dessert;
	}
	
	@Autowired
	@Cold
	@Creamy
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public void haveSnacks(){
		dessert.beHappy();
	}
	
}
