
public class trycatch1 {

	public static void main(String[] args) {
		System.out.println("----App started----");
   int[] arr= {10,20,30,40,50,60,70};
   int a=77,b=0,c=0;
   
   
   System.out.println(arr[0]);
   try {
	   
   c=a/b;
 
   }
   catch(Exception e){
	   
	   System.out.println(e); 
	 e.printStackTrace();
   }
   finally{
	   			System.out.println("This is Awesome");
	   		}
  
   System.out.println("-----App finished------");
   
  }
}
