package chapter02;

/**
 * 多态和内部类
 * 
 * @author HuanQing
 * @since 2020-02-22
 */
public class Case06PolymophicAndInnerClass {

	public static void main(String[] args) {
		/**
		 * 1 polymophic: 1.1.1 多态的意义： 一个类型的引用在指向不同的对象时会有不同的实现； 同一个对象，造型成不同的类型时，会有不同的功能。
		 */
		Player bp = new BasketballPlayer();
		Player co = new Coach();
		bp.play();
		co.play();

		/**
		 * 1.1.2 向上造型： 一个类的对象可以向上造型的类型有： 父类的类型、它所实现的接口的类型。 Java编译器根据类型检查方法调用是否正确。
		 */

		/**
		 * 1.1.3 强制转型： 可以通过强制转换将父类型变量转换成子类型变量， 前提是该变量指向的对象确实是该子类类型。
		 * 也可以通过强制转换将变量转换为某种接口类型， 前提是该变量指向的对象确实实现了该接口。 如果在强制转换过程中违背了上述两个前提，
		 * 将会抛出ClassCastException。
		 */

		/**
		 * 1.1.4 instanceof关键字： 在强制转型中，为了避免出现ClassCastException，
		 * 可以通过instanceof关键字判断某个引用指向的对象是否为指定类型。
		 */
		System.out.println(bp instanceof Player);
		System.out.println(co instanceof Player);
		System.out.println(bp instanceof BasketballPlayer);
		System.out.println(co instanceof Coach);

		/**
		 * 2. inner class
		 */

	}

}

/**
 * 1.1.1 多态的意义
 * 
 * @author HuanQing
 * @since 2020-02-22
 */
interface Player {
	void play();
}

/**
 * 1.1.1 多态的意义
 * 
 * @author HuanQing
 * @since 2020-02-22
 */
class BasketballPlayer implements Player {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing basketball...");
	}

}

/**
 * 1.1.1 多态的意义
 * 
 * @author HuanQing
 * @since 2020-02-22
 */
class Coach implements Player {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("coaching player...");
	}

}