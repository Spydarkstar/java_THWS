package basic;

abstract class shape{
	public double calculatearea(){
		return 0;
	}
}
class triangle extends shape{
	private double height_;
	private double base_;
	public triangle(int height,int base) {
		this.height_ = height;
		this.base_ = base;
	}
	public double calculatearea() {
		double formula = 0;
		formula = 0.5*height_*base_;
		return formula;
	}
	
}
class circle extends shape{
	private double radius_;
	public circle(double radius) {
		this.radius_ = radius;
	}
	public double calculatearea() {
		return 3.14*radius_*radius_;
	}
	
}

class rectangle extends shape{
	private double length_;
	private double breath_;
	public rectangle(double length,double breath) {
		this.breath_=breath;
		this.length_=length;
	}
	public double calculatearea() {
		return breath_*length_;
	}
}

class trapeze extends shape{
	private double sidea_;
	private double sideb_;
	private double sidec_;
	public trapeze(double sidea,double sideb,double sidec) {
		this.sidea_ = sidea;
		this.sideb_ = sideb;
		this.sidec_ = sidec;
	}
	public double calculatearea() {
		return ((sidea_+sideb_)/2.0)*sidec_;
	}
	
}

public class abstarctclasses {
	public static void main(String[] args) {
		shape shape[] = {
			new triangle(12,13),new circle(34.5),new circle(23.5),new trapeze(12,23,45),
			new rectangle(12,9),new triangle(11,7),new rectangle(8,7), new trapeze(6,22,6)
		};
		for(int i=0;i<=shape.length-1;i++) {
			System.out.println(shape[i].getClass().getSimpleName()+" : "+shape[i].calculatearea());
		}
	}
}
