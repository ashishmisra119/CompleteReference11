package closerLookAtMethodsAndClasses;

public class OverLoad2 {

	public static void main(String[] args) {
		OverLoadDemo2 ob = new OverLoadDemo2();
		int i = 88;
		
		ob.test();
		ob.test(10,20);
		
		ob.test(i); //this will invoke test(double)
		ob.test(123.2); // this will invoke test(double)
	}

}
