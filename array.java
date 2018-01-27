
public class array {


	public static void main(String[] args) {

		//primitive type
		int i=10;
		//int w=10,20; err

		//reference type
		int[] a= {10,20,30,40,50,60,70};//implicit
			
		int b[]= {12,13,14,15};	


		int[] c=new int[] {20,30,40};//explicit
		//int[] d=new int[5] {11,23,12,12,12,34};  err can't give size

		int d=i;// value copy

		int[] e=c;//reference copy 
		
		
		System.out.println("i is" +i);
		System.out.println("d is" +d);
		System.out.println("a is" +a);
		System.out.println("b is" +b);
		System.out.println("c is" +c);
		System.out.println("e is" +e);
		//read the array
		System.out.println(a[6]);
		System.out.println(b[3]);

		//to find length
int length=c.length;
System.out.println("Length is" +length );
			

/*for(int idx=0;idx<length;idx++){
			System.out.println(a[idx]);
		}*/
		
		// Enhanced For Loop | For-Each Loop
		for(int z : a){
			System.out.println(z);
		}
}}