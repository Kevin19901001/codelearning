package action.chapter03.entity;

import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {

	@Override
	public String beHappy() {
		System.out.println("Cake: very delicious! You'll be happy after eating it!");
		return "Cake: very delicious! You'll be happy ater eating it!";
	}

}
