
public class method {
void hello(){
	System.out.println("Hey,how have you been....");
	System.out.println("Hey,sherry....");
	System.out.println("Hey,how's your family.....");
	
}
static void say(){
	System.out.println("Hey,this is the static method ");
}
void addNums(String name, int n1, int n2){
	 		int n3 = n1+n2;
	 		System.out.println("Dear, "+name+" n3 is: "+n3);
	 	}
	public static void main(String[] args) {
		
method ab=new method();
ab.hello();
say();

ab.addNums("ab",1,2);
ab.addNums("ac",3,4);

ab.addNums("ad",5,7);

}

}
