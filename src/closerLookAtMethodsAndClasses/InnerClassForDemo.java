package closerLookAtMethodsAndClasses;

class OuterFor {
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<10; i++) {
			class Inner {
				void display() {
					System.out.println("display: outer_x = " + outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
	
}

public class InnerClassForDemo {
	public static void main(String[] args) {
		OuterFor outer = new OuterFor();
		outer.test();
	}

}
