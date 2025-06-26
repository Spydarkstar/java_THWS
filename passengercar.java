package basic;

public class passengercar {
	private String manufacture;
	private String model;
	protected int construction_year;
	private String color;
	protected int performance;
	private String autopilot_avai;
	private String current_position;
	private boolean isrunning;
	private boolean absavailable;
	public static int car_counter_ = 0;
	
	public passengercar(String manufacture,String model,String color,
			int performance,int construction_year,boolean absavailable) {
		super();
		this.manufacture = manufacture;
		this.model = model;
		this.color = color;
		this.performance = performance;
		this.construction_year = construction_year;
		this.absavailable = absavailable;
		car_counter_++;
	}
	public void start_engine() {
		isrunning = true;
		System.out.println("Engine Started ");
	}
    public void stop_engine() {
    	isrunning = false;
    	System.out.println("Engine stoped ");
	}
    public int calculateage() {
    	int years = 2025-construction_year;
    	return years;
    }
    public void printstatus() {
    	System.out.println("Manufacturer : " + manufacture);
    	System.out.println("Model : "+model);
    	System.out.println("Color : "+color);
    	System.out.println("On Status : "+isrunning);
    	System.out.println("Years of Contruction : "+construction_year);
    	System.out.println("absavailable : "+absavailable);
    	System.out.println("Performance : "+performance);
    	System.out.println("Car Age : "+ calculateage()+" years Old");
    	System.out.println("There are "+car_counter_+" cars now");
    }
    
	public static void main(String[] args) {
		passengercar cars1 = new passengercar("volkswagen","Golf VI","Red",140,2009,true);
		cars1.printstatus();
		System.out.println("\n");
		passengercar cars2 = new passengercar("MercedesBenz","A3","White",240,2019,true);
		cars2.printstatus();
		System.out.println("\n");
		passengercar cars3 = new passengercar("Audi","R8","Black",380,2024,true);
		cars3.printstatus();
	}
	
}
