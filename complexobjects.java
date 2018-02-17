    class Man {
	String name;
	byte age;
	String gender;
	Address1 address;
	String qualification;
	String dob;
	Job job;
	
	void showpersondetails(){
		System.out.println("Here are the man's details");
		System.out.println(name+" is "+age+" years old have qualification "+qualification+"is "+gender);
	
		address.showAddressdetails();
	
	    job.showJobDetails();
			}
	}
	class Address1{
		int strtno;
		String city;
		String state;
		int zipcode;
		void showAddressdetails() {
			System.out.println("Street number is "+strtno+" of city "+city+" having zip code "+zipcode+" of state "+state);
			}
	}
		class Job{
			 	String CompName;
			 	int salary;
			 	String designation;
			 	
			 	void showJobDetails(){
			 		System.out.println(designation+" receives a salary of \u20b9 "+salary+" in "+CompName);
			 	}
	}
	
	public class complexobjects {
public static void main(String[] args) {
		
		Man m=new Man();
		System.out.println("manis "+m);
		m.name="Anmol";
		m.age=20;
		m.gender="male";
        m.qualification="btech";
	    m.dob="6th feb";
	    
	   System.out.println("Address Details: ");
		
		Address1 a=new Address1();
		
		a.strtno=7;
		a.city="barnala";
		a.state="punjab";
		a.zipcode=148101;
		//a.showAddressdetails();
		
		
		// has a relationship
		
		 m.address=a;
		
		System.out.println("Job Details :");
		Job j=new Job();
		j.CompName="Accenture";
		j.salary=40000;
		j.designation="software engineer";
		//j.showJobDetails();
		
		m.job=j;
		
		m.showpersondetails();
		}

}
