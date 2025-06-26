package basic;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class inputs{
	private String first_name;
	private String sur_name;
	private String Street;
	private int street_no;
	private int postal_code;
	private String city; 
	
	void names() {
		//exercise 4.3
		Scanner getvalue = new Scanner(System.in); 
		System.out.println("Enter the First Name \n");
		this.first_name = getvalue.nextLine();
		System.out.println("Enter the SurName \n");
		this.sur_name = getvalue.nextLine();
		System.out.println("Your First Name is " + this.first_name + " Your Surname is " + this.sur_name);	
	}
	void streets() {
		//exercise 4.4
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter Your Street Name ");
		this.Street = in.nextLine();
		System.out.println("Enter Your Street Number ");
		this.street_no = in.nextInt();
		in.nextLine();
		System.out.println("Enter Your Postal Code ");
		this.postal_code = in.nextInt();
		in.nextLine();
		System.out.println("Enter Your City ");
		this.city = in.nextLine();
		
		System.out.println("\nStreet Name : "+this.Street+" \nStreet Number : "
				+ this.street_no + " \nPostal Code : " + this.postal_code + "\nCity : " + 
				this.city);
		
	}
	void display() {
		//exercise5.2
		System.out.println("\"The output 'c:\\' needs a little bit effort.\"");
	}
	void age() {
		//exercise5.6
		Scanner getvalue = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = getvalue.nextInt();
		if(age < 18) {
			System.out.println("NOT Full Age.."); 
		}else {
			System.out.println("Full Age..");
		}
		
	}
	void calculator() {
		//exercise 5.7
		Scanner getvalue = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = getvalue.nextInt();
		System.out.println("Enter a Another Number");
		int b = getvalue.nextInt();
		System.out.println("The Sum is : " + (a+b));
		System.out.println("The Difference is : " + (a-b));
		System.out.println("The Product is : " + (a*b));
		System.out.println("The Quotient is : " + (a/b));
		
	}
	void looping() {
		//Exercise 5.8
		for(int i = 1; i<= 100; i++) {
			if(i%10 == 0) {
				System.out.println(" "+ i);
			}else {
				System.out.print(" "+ i);
			}
		}
	}
	void combined() {
		//exercise 5.9
		Scanner getvalue = new Scanner(System.in);
		boolean prime = true;
		System.out.println("Enter First Number : ");
		int a = getvalue.nextInt();
		System.out.println("Enter Second Number : ");
		int b = getvalue.nextInt();
		if(a <= 2) {
			if(a == 1) {
				System.out.println("prime number ");
			}
			System.out.println("not prime number ");
		}else{
			for(int i = 2; i<=a; i++) {
				if(a%i == 0) {
					prime = true;
				}else {
					prime = false;
				}
			}
		}
		if(prime == true) {
			System.out.println(" prime number ");
		}else {
			System.out.println("not prime number ");
		}
		if(b%2 == 0) {
			System.out.println("Second Number is even");
		}else {
			System.out.println("Second NNumber is odd");
		}
		if(a%b == 0) {
			System.out.println("Divisible");
		}else {
			System.out.println("not Divisible");
		}
		
	}
	void factorial() {
		Scanner getvalue = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int a  = getvalue.nextInt();
		int b = 1;
		for(int i = 1; i<= a; i++) {
			b = b*i;
		}
		System.out.println("the factorial of the number is = "+b);
	}
	void determineprime() {
		//Exercise 6.4
		boolean prime = true;
		ArrayList<Integer> values = new ArrayList<>();
		Scanner getvalue = new Scanner(System.in);
		System.out.println("Enter Limit");
		int a  = getvalue.nextInt();
		for(int i=1;i<=a; i++) {
		if(prime) {
			System.out.println("the prime numbers are " + values);
		}else {
			System.out.println("no prime numbers");
		}
	}

	
}
	void allloop() {
		//excercise 6.5
		ArrayList<Integer> fvalue = new ArrayList<>();
		ArrayList<Integer> wvalue = new ArrayList<>();
		ArrayList<Integer> dwvalue = new ArrayList<>();
		for(int i = 1; i<=15; i++) {
			fvalue.add(i*i);
		}
		int a = 15;
		while(a > 0) {
			wvalue.add(a*a);
			a--;
		}
		int b = 15;
		do {
			dwvalue.add(b*b);
			b--;
		}while(b > 0);
		
		System.out.println("for loop values = " + fvalue);
		System.out.println("while loop values = " + wvalue);
		System.out.println("do while loop values = " + dwvalue);
		
	}
	void infinitepattern() {
		//exercise 6.6
		String str = "++";
		StringBuffer cstring = new StringBuffer(str);
		System.out.println(str);
		int a = 0;
		int b = 0;
		for(int i = 1; i<=100; i++) {
			if(str.length() == 2) {
				str = str  + "+";
				System.out.println(str);
			}
			else if(str.length() == 5){
				for(int j = 1; j<=str.length();j++) {
					if(str.length() <= 5 && str.length()!=2) {
						str = str.substring(0,str.length()-1);
						System.out.println(str);
					}
				}
			}else {
				str = str  + "+";
				System.out.println(str);
			}
				
			}
		}
	void evenstore() {
		//exercise 6.8
		ArrayList<Integer> values = new ArrayList<>();
		for(int i=1; i<=100;i++) {
			if(i%2 == 0) {
				values.add(i);
			}	
	}
		 for (int i = values.size() - 1; i >= 0; i--) {
	            System.out.println(values.get(i));
	        }
		
		
		}
	void numbersten() {
		Scanner getvalues = new Scanner(System.in);
		ArrayList<Integer> value = new ArrayList<>();
		for(int i = 1; i<=10; i++) {
			System.out.println("Enter Number " + i +": ");
			value.add(getvalues.nextInt());
		}
		/*for(int i=0; i<=value.size();i++) {
			
		}*/
	}
	
	}

public class helloworld {
	public static void main(String[] args) {
		inputs callf = new inputs();
		callf.numbersten();
		}
}
