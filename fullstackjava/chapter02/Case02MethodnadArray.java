package chapter02;

public class Case02MethodnadArray {

	public static void main(String[] args) {
		
		
		
		
		
		// Reference type array:
	}
	
	// Method overload:
	// Method sign: method name and argument list.
	public boolean pay(double money) {return true;}
	public boolean pay(String cardNo, String pwd) {return false;}
}


// Constructure:
class Cell {
	int raw;
	int col;
	
	// Initialize member variable through constructure:
	public Cell(int raw, int col) {
		super();
		this.raw = raw;
		this.col = col;
	}
	
	// Key word 'this':
	public void drop() {
		this.raw++;
	}
	
	// Default constructure:
	Cell(){};
}
