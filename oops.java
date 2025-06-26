package basic;



public class oops {
			private int day;
			private int month;
			private int year;
			
			public oops(int day,int month,int year) {
				super();
				this.day = day;
				this.month = month;
				this.year = year;
			}
			public int day() {
				return day;
			}
			public int month() {
				return month;
			}
			public int year() {
				return year;
			}
			/*public void setdate(int day) {
				this.day = day;
			}
			public void setmonth(int month) {
				this.month = month;
			}
			public void setyear(int year) {
				this.year = year;
			}*/
			public String tostring() {
				return String.format(day+"."+month+"."+year);
			}
			
	public static void main(String[] args) {
	oops mydate = new oops(1,2,2003);
	System.out.println(mydate.tostring());
	}
}
