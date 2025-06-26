package basic;

interface ShapeInterface{
	public double calculatearea();
}

abstract class shapeinterfaceimp implements Comparable < ShapeInterface > , ShapeInterface{
	public int compareTo ( ShapeInterface o ) {
		 if ( this . calculatearea () < o . calculatearea ()) {
		 return -1;
		 }
		else {
		 if ( this . calculatearea () > o . calculatearea ()) {
			 return +1;
			 }
		 }
		 return 0;
		 }
		 
}
class triangles extends shapeinterfaceimp{
	private double height_;
	private double base_;
	public triangles(double height,double base) {
		this.height_ = height;
		this.base_ = base;
	}
	public double calculatearea() {
		double formula = 0;
		formula = 0.5*height_*base_;
		return formula;
	}
	
}
class circles extends shapeinterfaceimp{
	private double radius_;
	public circles(double radius) {
		this.radius_ = radius;
	}
	public double calculatearea() {
		return 3.14*radius_*radius_;
	}
	
}

class rectangles extends shapeinterfaceimp{
	private double length_;
	private double breath_;
	public rectangles(double length,double breath) {
		this.breath_=breath;
		this.length_=length;
	}
	public double calculatearea() {
		return breath_*length_;
	}
}

class trapezes extends shapeinterfaceimp{
	private double sidea_;
	private double sideb_;
	private double sidec_;
	public trapezes(double sidea,double sideb,double sidec) {
		this.sidea_ = sidea;
		this.sideb_ = sideb;
		this.sidec_ = sidec;
	}
	public double calculatearea() {
		return ((sidea_+sideb_)/2.0)*sidec_;
	}
	
}

public class shapeinter {
	public static void main(String[] args) {
		triangles tri2 = new triangles (3.0  , 4.0 );
		rectangles rect2 = new rectangles (5.0  , 6.0  );
		trapezes trap2 = new trapezes (2.0 , 3.0  , 4.0  );
		circles circ2 = new circles (1.0  );
		shapeinterfaceimp shapes [] = { tri2 , rect2 , trap2 ,
				 circ2 };
				
				 Comparable < ShapeInterface > smallestShape =
				 shapes [0];
			 for (int i = 0; i < shapes . length ; i ++) {
				 System . out . println (
				 shapes [ i ]. getClass (). getName () + ": "
				 + shapes [ i ]. calculatearea ());
				
				 if ( smallestShape . compareTo ( shapes [ i ]) > 0)
				 smallestShape = shapes [ i ];
				 }
				
				 System . out . println ();
				 System . out . println (" smallest shape : "
				 + smallestShape . getClass (). getName ());
				 }
	

	}

