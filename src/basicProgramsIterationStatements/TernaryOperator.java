package basicProgramsIterationStatements;

public class TernaryOperator {

	public static void main(String[] args) {
        int i,k;
        
        i = 10;
        k=i<0?-i:i;
        System.out.println("the absolute value of  " + i +" is "+ k );
        
        i=-10;
        k=i<0?-i:i;
        System.out.println("the absolute value of  " + i +" is "+ k );
        
	}

}
