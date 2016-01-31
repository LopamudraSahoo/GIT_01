package staticExapmles;

public class StaticExample1 {
	int x=100;
	//While calling non-static varibles or method from another non-static method we do not have to call them using object.
		public void nonstaticmethod1(){
			System.out.println("Access instance variable without object "+x);//access instance variable without creating object.As the nonstaticmethod1() is non-static we can do this.
			nonstaticmethod2();//access non-static method without object.As the nonstaticmethod1() is non-static we can do this.
		}
		
		public void nonstaticmethod2(){
			System.out.println("Access non-ststic method without object");
		}
		
		public static void staticmethod(int a){
			System.out.println("value of a "+ a);
		}
	public static void main(String[] args) {
		StaticExample1 s1 = new StaticExample1();
		//System.out.println(x);As main() is static method we can not call non-static variables without creating objects
		System.out.println(s1.x);
		//nonstaticmethod1();showed error as we are calling non-static method inside static method without creating object
		s1.nonstaticmethod1();
		staticmethod(8);			
	}

}
