class user {
	String name;
	byte age;
	String phone;
	String email;
	char gender;
	user(){//constructor
		name="anmol";
		age=11;
		phone="1111";
		email="nsdsds@gmail.com";
		gender='m';
		System.out.println("user object constructed");
	}
	void showuserdetailes() {
		System.out.println(name+"can be called at"+phone);
	}
	}

class facebookuser extends user {
	String status;
	 
	 	 void facebookuser1() {
	 		System.out.println("FaceBookUser Object Constructed");
	 	}
	 }

public class inheritence {

	public static void main(String[] args) {
	
		facebookuser fb=new facebookuser();
		fb.facebookuser1();
		fb.showuserdetailes();
		
		
		//user u1=new user();
//u1.showuserdetailes();
//u1.name="rrrsheery";
//u1.age=12;

	}

}
