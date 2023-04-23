package closerLookAtMethodsAndClasses;


class TestStack2 {
	public static void main(String[] args) {
		ImprovedStack mystack1 = new ImprovedStack(5);
		ImprovedStack mystack2 = new ImprovedStack(8);
		
		for(int i=0; i<5; i++) mystack1.push(i);
		for(int i=0; i<8; i++) mystack2.push(i);
		
		System.out.println("Stack in mystack1 :  ");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2 :");
		for(int i=0; i<8; i++)
			System.out.println(mystack2.pop());
		
	}
}
