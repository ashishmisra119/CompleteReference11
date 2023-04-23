package basicProgramsIterationStatements;

public class Average {

	public static void main(String[] args) {
		double nums[] = {10.1,11.2,12.3,13.4,14.5};
		double result = 0;
		int i;
		for(i=0; i<5; i++) 
			result = result + nums[i];
		System.out.println(result);
		System.out.println("Average is " + result / 5);
		
		
		int x = 42;
		float y = 42.5f;
		
		System.out.println("mod of x is:" + x % 10);
		System.out.println("mod of x is:" + y % 10);

		
	}

}
