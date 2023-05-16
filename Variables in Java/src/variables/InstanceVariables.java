package variables;

public class InstanceVariables {
	
	public int rollNum;
	public String name;
	public int totalMarks;
	public int number;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariables obj = new InstanceVariables();
		obj.rollNum = 1025;
		obj.name = "Test Engineer";
		obj.totalMarks = 520;
		obj.number = 5864589;
		
		System.out.println(obj.rollNum + "  " + obj.name + "  " + obj.totalMarks + "  " + obj.number);

	}

}
