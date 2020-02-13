package chapter02;

import javax.swing.JFrame;

public class Case03MemoryAndInheritence {

	public static void main(String[] args) {
		// 1.Obejct memory management:
		// JVM memory: heap, stack, method area
		// Objects in the heap;
		// GC: Garbage Collection;
		// System.gc();
		
		// Local variable in stack;

		// Member variable and local variable:
		// Local variable: defined in method, without default value, must be inited when defining;
		// Existed int stack and was cleared after method calling.
		
		// Member variable: defined in class, out of method, with defaut value;
		// existed in heap when create object of class.
		
		// Method area: store class info
		// Just one method:
		JFrame jf1 = new JFrame();
		JFrame jf2 = new JFrame();
		jf1.setSize(200, 300);
		jf2.setSize(400, 500);
		
	}

}


// 2.Inheritance:
// Keyword 'extends':
class Animal {
	public Animal() {}
}

class Cat extends Animal {
	public Cat() {}
}