class employee{
	String eid;
	String name;
	int salary;
	
	employee(String eid,String n,int s){
		this.eid=eid;
		name=n;
		salary=s;
		}
	
	 void display(){
		System.out.println("E-mail id is "+eid+" name is "+name+" salary is "+salary);
	}
	}

class certificate{
 int cid;
 String cname;
 int validity;
 
 certificate(int cid,String cn,int v){
	 this.cid=cid;
	 cname=cn;
	 validity=v;
	}
 
 void display1() {
	 System.out.println("Certificate Id is "+cid+" Certificate name is "+cname+"Certificate validity is "+validity);
 }
 }

public class complexobject1 {

	public static void main(String[] args) {
		
 employee e1=new employee("emp123.@gmail.com","employee",100000);
 employee e2=new employee("emp1234.@gmail.com","employe55e",400000);
 e1.display();
 e2.display();
 
  certificate c1=new certificate(11123,"Admin",2020);
 certificate c2=new certificate(11123,"Admin",2020);
 
 c1.display1();
 c2.display1();
 }
}
