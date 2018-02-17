package auribises;

 class emp{
	int salary;
	String name;
	Address address;
	
	void a( int s,String n){
		salary=s;
		name=n;
		
	}
	void display() {
		System.out.println("Salary is "+salary+" name is "+name);
	}
}
class Address{
	String city;
	String state;
	String House_number;
	
	void b(String c, String s, String h) {
		city =c;
		state=s;
		House_number=h;
	}
	void dd() {
		System.out.println(" City is "+city+" State is "+state+" House number is "+House_number );
	}
}
public class aggregation {

	public static void main(String[] args) {
Address a1 = new Address();
a1.b("Barnala", "Punjab", "77");
a1.dd();
emp e=new emp();
emp e1=new emp();
e.a(100000,"knmol");
e1.a(700000,"Anmol");

e.display();
e1.display();
	}

}
