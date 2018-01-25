

class shape{
	void draw() {
		System.out.println("Draw a shape");
	}
	
}
class circle extends  shape{
	void draw(){
		System.out.println("Draw a circle");
	}
	}
class rectangle extends shape{
	void draw(){
		System.out.println("Draw a rectangle");
	}
}
public class rtm {
	public static void main(String[] args) {
		
	shape s;

s=new circle();
s.draw();

s=new rectangle();
s.draw();

}
}