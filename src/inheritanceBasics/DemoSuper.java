package inheritanceBasics;

class SuperBox {
	private double width;
	private double height;
	private double depth;
	
	// construct clone of an object
	SuperBox(SuperBox ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	// constructor used when all dimensions specified
	SuperBox(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	SuperBox() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	// constructor used when cube is created
	SuperBox(double len) {
		width = height = depth = len;
	}
	
	//	compute and return volume
	double volume() {
		return width * height * depth;
	}
}

//NewSuperBoxWeight now fully implements all constructors.
class NewSuperBoxWeight extends SuperBox {
	double weight;
	
	// construct clone of an object
	NewSuperBoxWeight (NewSuperBoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}
	
	//constructor when all parameters are specified
	NewSuperBoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
	
	// default constructor
	NewSuperBoxWeight(){
		super();
		weight = -1;
	}
	
	// constructor used when cube is created
	NewSuperBoxWeight(double len, double m){
		super(len);
		weight = m;
	}
}

public class DemoSuper {
	public static void main(String[] args) {
		NewSuperBoxWeight mySuperBox1 = new NewSuperBoxWeight(10, 20, 15, 34.3);
		NewSuperBoxWeight mySuperBox2 = new NewSuperBoxWeight(2, 3, 4, 0.076);
		NewSuperBoxWeight mySuperBox3 = new NewSuperBoxWeight();
		NewSuperBoxWeight mycube = new NewSuperBoxWeight(3,2);
		NewSuperBoxWeight myclone = new NewSuperBoxWeight(mySuperBox1);
		double vol;		
		
		vol = mySuperBox1.volume();
		System.out.println("Volume of mySuperBox1 is " + vol);
		System.out.println("Weight of mySuperBox1 is " + mySuperBox1.weight);
		System.out.println();
		
		vol = mySuperBox2.volume();
		System.out.println("Volume of mySuperBox2 is " + vol);
		System.out.println("Weight of mySuperBox2 is " + mySuperBox2.weight);
		System.out.println();
		
		vol = mySuperBox3.volume();
		System.out.println("Volume of mySuperBox3 is " + vol);
		System.out.println("Weight of mySuperBox3 is " + mySuperBox3.weight);
		System.out.println();
		
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
		System.out.println();
		
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();
	}
}
