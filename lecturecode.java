package basic;

class person{
	protected String f_name;
	protected String l_name;
	protected int age;
	public person(String fname,String lname,int age) {
		this.f_name = fname;
		this.l_name = lname;
		this.age = age;
	}
	public String toString() {
		String description = super.toString();
		description += "My name is "+f_name+" "+l_name+" I am "+age+" years Old";
		return description;
		}
	
}
class employee extends person{
	protected String f_name_e;
	protected String l_name_e;
	protected int age_e;
	protected int personal_number;
	protected String department;
	public employee(String fname,String lname,int age,int p_num,String dpart) {
		super(fname,lname,age);
		this.personal_number = p_num;
		this.department = dpart;
	}
	public String toString() {
		String description = super.toString();
		description += " My Personal Number is "+personal_number+" "
				+ "I am Working Under "+department+" Department";
		return description;
	}
	
}
public class lecturecode {
	public static void main(String[] args) {
		person p1 =  new person("yovan","shalu",21);
		System.out.println(p1);
		
		employee e1 = new employee("danestan","lazer",45,23424,"fishing");
		System.out.println(e1);
		
		employee e2 = new employee("dony","antony",21,22234,"designing");
		System.out.println(e2);
	}
}
