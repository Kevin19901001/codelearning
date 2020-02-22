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
		 * 1 polymophic: 1.1.1 ��̬�����壺 һ�����͵�������ָ��ͬ�Ķ���ʱ���в�ͬ��ʵ�֣� ͬһ���������ͳɲ�ͬ������ʱ�����в�ͬ�Ĺ��ܡ�
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
		 * 2. inner class
		 */

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