package variables;

public class LocalVariable {
	
	public void calculate() {
		
		// initialized a local variable "height"
		int height = 0;
		
		height = height + 170;
		System.out.println("height is: " + height + "cm");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a is a reference used to call calculate() method
		LocalVariable a = new LocalVariable();
		a.calculate();

	}

}
