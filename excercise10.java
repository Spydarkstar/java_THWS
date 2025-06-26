package basic;
class print{
	protected String name_;
	protected int count=1;
	public void process(String name) {
		for(int i=0;i<name.length();i++) {
				System.out.print("\""+name.charAt(name.length()-count)  +"\""+"+");
				count++;
		}
	}
	public int reverselex(String s1,String s2) {
		if(s1.toUpperCase().compareTo(s2.toUpperCase()) < 0) {
			return 1;
		}
		if(s1.toUpperCase().compareTo(s2.toUpperCase()) > 0) {
			return -1;
		}
		return 0;
	}
	public void palindrome(String any) {
		int count =1;
		String reverse = "";
		for(int i =0; i<any.length();i++) {
			reverse += any.charAt(any.length()-count);
			count++;
		}

		if(any.equals(reverse) == true) {
			System.out.println();
			System.out.println("Entered String is Palindrome : "+any);
		}else {
			System.out.println();
			System.out.println("Entered String is not a Palindrome : "+any);
		}
	}
}
public class excercise10 {
	public static void main(String[] args) {
		print p = new print();
		p.palindrome("Yovan");
		p.palindrome("BoB");
	}
}