class person{
	String name;
	byte age;
	char gender;
	Address21 address;// reference variable   has-a relationship
	String qualification;
	String job;
	
void display() {
	
	address.display1();
	System.out.println(name+" is "+age+" years old is "+gender+" having qualification"+qualification+" and job "+job);
	
}
}
class Address21{
	String adsli;
	String city;
	String state;
	int zipcode;
	
	 Address21(String adsli,String c, String s,int z){
		this.adsli=adsli;
		city=c;
		state=s;
		zipcode=z;
		}
	 
	void display1() {
		
		System.out.println("Street is "+adsli+" of city "+city+" and state "+state+" having zipcide "+zipcode);
	}
	}
public class complexobject {
public static void main(String[]args) {
	person p1=new person();
	System.out.println("p1 is:"+p1);
	p1.name="John";
	p1.age=33;
	p1.gender='M';
	p1.qualification="B.tech";
	p1.job="Software Engineer";
	
	Address21 a1=new Address21("Redwood Street","Patiala","Punjab",22331);

	p1.address=a1;  // has a relationship
	
	p1.display();
}
}
