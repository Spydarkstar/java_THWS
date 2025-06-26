package basic;


class customer{
	String name;
	int age;
	
	void cusfunction() {
		System.out.println("Welcome " + name);
		if(age<=0) {
			System.out.println("Age Cannot Be Zero or Less Than Zero.");
			
		}else if(age >0 && age <= 16) {
			System.out.println("Sorry not eligible ");
		}else {
			System.out.println("Youre a Good Fit ");
		}
	}
}

public class classes{
	public static void main(String[] args) {
		customer cus = new customer();
		cus.name = "Yovan";
		cus.age = 0;
		cus.cusfunction();
	}	
}



