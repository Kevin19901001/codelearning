package action.chapter03.entity;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {

	@Override
	public String beHappy() {
		System.out.println("Cookies: what a delicious cookie!");
		return "Cookies: what a delicious cookie!";
	}

}
