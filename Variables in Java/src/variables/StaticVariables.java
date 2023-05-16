package variables;

public class StaticVariables {
	
	public static int radius;
	
	private static final double pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		radius = 3;
		System.out.println("Circumference of a circle is: " + 2*pi*radius);
		
		

	}

}
