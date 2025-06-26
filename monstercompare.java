package basic;

class monster implements Comparable<monster>{
	private int teeth_;
	private String name_;
	private double height_;
	private int age_;
	private double bforce_;
	private int  count_=0;
	private int[] teeths_;

	protected static int allcount_ = 0;
	public monster(int teeth,String name,double height,int age,double bforec) {
		this.teeth_ = teeth;
		this.name_ = name;
		this.height_ = height;
		this.age_ = age;
		this.bforce_ = bforec;
		allcount_++;
		allcount_++;
	}
	public void behaviour() {
		System.out.println("Monster ");
		System.out.println("Monster Use : "+bforce_+" Bite Force");
		System.out.println("Age of Monster is : "+age_);
	}
	public void Description() {
		System.out.println("Monster Name : "+name_);
		System.out.println("Monster Age : "+age_ +" Years Old");
		System.out.println("Monster height : "+height_+" feet");
		System.out.println("Monster Bite Force : "+bforce_+" psi");
		System.out.println("Monster No of Teeth : "+teeth_ +" teeths");
		System.out.println();
	}
	public int compareTo(monster other) {
        if(this.teeth_ < other.teeth_) {
        	return -1;
        	
        }
        	 if(this.teeth_ > other.teeth_) {
             	print(this.teeth_);
             	return 1;
             	
             }
     
        return 0;
    }
	public void print(int avalue) {
		System.out.println(avalue);
		teeths_ = new int[allcount_];
     	for(int i=0;i<1;i++) {
     		System.out.println("this"+avalue);
     		teeths_[count_] = avalue;
     		count_++;
     	}
     	for(int i=0;i<teeths_.length;i++) {
     		System.out.println(" element "+i+" : "+teeths_[i]);
     	}
	}
	
}


class monsterbaby extends monster{
	private double bmbforce_;
	private int mbage_;
	public monsterbaby(int teeth,String name,double height,int age,double bforce) {
		super(teeth,name,height,age,bforce);
		this.bmbforce_ = bforce;
		this.mbage_ = age;
	}
	public void behaviour() {
		System.out.println("Baby Monster ");
		System.out.println("Baby Monster Use : "+bmbforce_+" Bite Force");
		System.out.println("Age of Baby Monster is : "+mbage_);
	}
	
}
class monsterteen extends monster{
	private double bmtforce_;
	private int mtage_;
	public monsterteen(int teeth,String name,double height,int age,double bforce) {
		super(teeth,name,height,age,bforce);
		this.bmtforce_ = bforce;
		this.mtage_ = age;
	}
	public void behaviour() {
		System.out.println("Teen Monster ");
		System.out.println("Teen Monster Use : "+bmtforce_+" Bite Force");
		System.out.println("Age of Teen Monster is : "+mtage_);
	}
	
}


public class monstercompare {
	
	public static void main(String[] args) {
		monster m = new monster(34,"Trex",450.34,240,6000.0);
		monsterbaby mb = new monsterbaby(45,"rexoserus",650.34,80,1200.0);
		monsterteen mt = new monsterteen(56,"dragon",850.34,100,2400.0);
		
		m.Description();
		mb.Description();
		mt.Description();
		
		System.out.println(m.compareTo(mb));
		System.out.println();	
		System.out.println(m.compareTo(mt));
		System.out.println();
		System.out.println(mb.compareTo(m));
		System.out.println();
		System.out.println(mb.compareTo(mt));
		System.out.println();
		System.out.println(mt.compareTo(m));
		System.out.println();
		System.out.println(mt.compareTo(mb));
		
	}
	
}
