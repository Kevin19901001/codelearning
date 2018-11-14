package action.chapter03.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {

	private ShoppingCart shoppingCart;

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	

	@Autowired
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	
}
