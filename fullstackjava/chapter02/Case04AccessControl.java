package chapter02;

import utils.Paper;

public class Case04AccessControl {

	public static void main(String[] args) {
		// 1.Inheritance:
		// 1.1.Method override:
		// 1.1.1.Test:
		NewsPaper newsPaper = new NewsPaper();
		newsPaper.p(); // NewPaper.p()

		Paper paper = new NewsPaper();
		paper.p(); // NewPaper.p()

		// 1.2.1.Test Using 'super' when overriding method:
		NewsPaper np = new NewsPaper(); // Paper.m(), NewsPaper.m()
		np.m();

		Paper op = new NewsPaper();
		op.m(); // Paper.m(), NewsPaper.m()

		// 2.1.Package:
		// Only use class name, name conflict will happen.
		// In Java, package can solve this problem.
		// For example: com.apache.commons.lang.StringUtils
		// In this example, 'StringUtils' is class name,
		// 'com.apache.commons.lang' is package name.

		// 2.2.'import' sentence:
		// When programming, some outside function would be used,
		// when it is needed, use 'import' to load the target.
		// For example: import utils.Paper;

		// Access control identifier:

		// static:

		// final:
	}

}

/**
 * Method overriding in inheritance
 * 
 * @author HuanQing
 * @since 2020-02-16
 */
class NewsPaper extends Paper {

	// 1.1.Method override:
	@Override
	public void p() {
		System.out.println("NewPaper.p()");
	}

	@Override
	public void m() {
		// 1.2.Use 'super' when overriding method:
		super.m();
		System.out.println("NewsPaper.m()");
	}

}