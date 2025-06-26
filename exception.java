package basic;
import java.util.Scanner;

class illegal{
	public void state() {
		Scanner val = new Scanner(System.in);
		System.out.println("Enter a Number in Range of 0 to 1000 : ");
		int value = val.nextInt();
		if(value >= 1 && value <= 1000) {
			System.out.println("Correct  Value : "+value);
		}else {
			val.close();
			throw new IllegalArgumentException("Entered Value is not in Range");
		}
		val.close();
	}
}
class evenodd{
	public void check() {
		Scanner val = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int value = val.nextInt();
		if(value % 2 ==0) {
			throw new EvenNumberException();
		}else {
			throw new OddNumberException();
		}
	}
}
class EvenNumberException extends RuntimeException{
	private static final long serialVersionUID = 5706920472293836276L ;
		public EvenNumberException() {
			super("Number is Even");
		}
	}
class OddNumberException extends RuntimeException{
	private static final long serialVersionUID = 5706920472293836276L ;
		public OddNumberException() {
			super("Entered Number is odd");
		}
	}	

class phonebook{
	protected static long[] phonenumber_;
	private int count_ = 1;
	public void phonebooks(long num){
		phonenumber_ = new long[10];
		this.phonenumber_[count_-1] = num;
		count_++;
	}
	public void checknum() {
		for(int i=0;i<=phonenumber_.length-1;i++){
			System.out.println("hello");
		}
	}
	
}
class persons extends phonebook{
	private String name_;
	private String sname_;
	protected static long phonenumber_;
	persons(String name,String sname,long phone){
		phonebooks(phone);
		this.name_ = name;
		this.sname_ = sname;
	}
}


public class exception {
	public static void main(String[] args) {
//		try {
//			illegal call = new illegal();
//			call.state();
//		}catch(IllegalArgumentException e) {
//			System.out.println("Exception Msg : "+e.getMessage());
//		}
//		try {
//			evenodd eo = new evenodd();
//			eo.check();
//		}catch(Exception e) {
//			System.out.println("Exception Msg : "+e.getMessage());
//		}
		
		persons p1 = new persons("Yovan","danestan",2333333333L);
		persons p2 = new persons("shalu","jnjnjnj",23333444555333L);
		persons p3 = new persons("ahsbhsba","hbhbhb",2937343748L);
		persons p4 = new persons("ssss","ddd",2933333748L);
		persons p5 = new persons("wwww","zzzz",8888643748L);
		phonebook book = new phonebook();
		book.checknum();
	}

}
