package staticExapmles;

public class StaticExample2 {
	int x;
	static String s;
	int y =100;
	
	//static block is executed before main()
	static{
		s = "Lopa";//s is static variable so we accessed it without creating object.
	}
	
	public void show(){
		System.out.println("x = "+ x);
		System.out.println("s = "+ s);
		System.out.println("y = "+ y);
	}
	public static void main(String[] args) {
		StaticExample2 s1 = new StaticExample2();
		
		//it will display x = 0 which is default value of int. 
		//it will display s = lopa as static block is already executed before main().so string s is assigned with value.
		//it will display y = 100 as it is already initialized after declaration.
		s1.show();
		
		s1.x = 100;
		s1.show();

	}

}
