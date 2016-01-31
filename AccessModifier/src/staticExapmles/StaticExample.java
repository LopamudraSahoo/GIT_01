package staticExapmles;

public class StaticExample {
	int x=100;
	static int y = 200;
	
	public void increament(){
		x++;
		y++;
	}
	
	public static void main(String[] args) {
		
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		s1.increament();
		s2.increament();
		System.out.println("value of x "+s2.x);//it will return 101 because x is attached to s2 object of the class
		System.out.println("value of y "+StaticExample.y);//it will return 202 because y is attached to class 
	}

}
