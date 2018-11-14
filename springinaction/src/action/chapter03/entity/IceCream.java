package action.chapter03.entity;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import action.chapter03.annotation.Cold;
import action.chapter03.annotation.Creamy;

/**
 * Besides 'Primary', we can use annotations
 * defined ourself to define unique bean.
 * @author Kevin
 * @since 2017-08-03
 */
@Component
//@Primary
@Cold
@Creamy
public class IceCream implements Dessert {

	@Override
	public String beHappy() {
		System.out.println("IceCream: so sweet that I don't want have anything else!");
		return "IceCream: so sweet that i don't want have anything else!";
	}

}
