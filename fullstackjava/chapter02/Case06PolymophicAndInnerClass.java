package chapter02;

/**
 * ��̬���ڲ���
 * 
 * @author HuanQing
 * @since 2020-02-22
 */
public class Case06PolymophicAndInnerClass {

	public static void main(String[] args) {
		/**
		 * 1.1 ��̬: 1.1.1 ��̬�����壺 һ�����͵�������ָ��ͬ�Ķ���ʱ���в�ͬ��ʵ�֣� ͬһ���������ͳɲ�ͬ������ʱ�����в�ͬ�Ĺ��ܡ�
		 */
		Player bp = new BasketballPlayer();
		Player co = new Coach();
		bp.play();
		co.play();

		/**
		 * 1.1.2 �������ͣ� һ����Ķ�������������͵������У� ��������͡�����ʵ�ֵĽӿڵ����͡� Java�������������ͼ�鷽�������Ƿ���ȷ��
		 */

		/**
		 * 1.1.3 ǿ��ת�ͣ� ����ͨ��ǿ��ת���������ͱ���ת���������ͱ����� ǰ���Ǹñ���ָ��Ķ���ȷʵ�Ǹ��������͡�
		 * Ҳ����ͨ��ǿ��ת��������ת��Ϊĳ�ֽӿ����ͣ� ǰ���Ǹñ���ָ��Ķ���ȷʵʵ���˸ýӿڡ� �����ǿ��ת��������Υ������������ǰ�ᣬ
		 * �����׳�ClassCastException��
		 */

		/**
		 * 1.1.4 instanceof�ؼ��֣� ��ǿ��ת���У�Ϊ�˱������ClassCastException��
		 * ����ͨ��instanceof�ؼ����ж�ĳ������ָ��Ķ����Ƿ�Ϊָ�����͡�
		 */
		System.out.println(bp instanceof Player);
		System.out.println(co instanceof Player);
		System.out.println(bp instanceof BasketballPlayer);
		System.out.println(co instanceof Coach);

		/**
		 * 1.2 �ڲ���
		 *
		 * 1.2.2 �����ڲ������
		 */
		Outer outer = new Outer(100);
		outer.printTime();				// 101
	}

}

/**
 * 1.1.1 ��̬������
 * 
 * @author HuanQing
 * @since 2020-02-22
 */
interface Player {
	void play();
}

/**
 * 1.1.1 ��̬������
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
 * 1.1.1 ��̬������
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

/**
 * 1.2.1 �����Ա�ڲ��� һ������Զ�������һ������ڲ������������ڲ������֮ΪInner�������ڵ����ΪOuter��
 * Inner��Outer���ڲ���ͨ��ֻ������Outer�����ⲿ���߱��ɼ��ԣ�Inner����ֱ�ӵ���Outer�ĳ�Ա������������˽�еģ���
 * 
 * @author HuanQing
 * @since 2020-02-23
 */
class Outer {
	private int time;

	private Inner inner;

	/**
	 * ������
	 * 
	 * @param time
	 */
	public Outer(int time) {
		super();
		this.time = time;
		this.inner = new Inner();
		inner.timeInc();
	}

	/**
	 * ��ӡʱ��
	 */
	public void printTime() {
		System.out.println(time);
	}

	/**
	 * �ڲ���
	 * 
	 * @author HuanQing
	 * @since 2020-02-23
	 */
	class Inner {
		public void timeInc() {
			time++;
		}
	}
}

/**
 * 1.2.2 ���������ڲ���
 * 
 * @author HuanQing
 * @since 2020-02-23
 */
interface Action {
	public void exec();
}

/**
 * 1.2.2 �����һ�γ����У���Ҫ����һ����Ķ���ͨ���������Ҫ�̳�ĳ���ӿڻ���ʵ��ĳ���ࣩ��
 * ���Ҵ�������������ļ�ֵҲ�Ͳ������ˣ��������Բ�����������Ϊ�����ڲ��ࡣ
 * 
 * @author Administrator
 * @since 2020-02-23
 */
class Main {

	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("In anonymous inner class, override unimplemented methdo!");
			}

		};

		action.exec();
	}

}