package enumerationsAutoboxingAnnotations;

public class AutoBox4 {
	public static void main(String[] args) {
		
		Integer iob = 100;
		Double dob = 98.6;
		
		dob = iob + dob;
		System.out.println("dob after expression: " + dob);
	}

}
