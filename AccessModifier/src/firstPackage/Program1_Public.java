package firstPackage;

public class Program1_Public {
	public String PP1_pub = "Public variable in public class";
	protected String PP1_pro = "Protected variable in public class";
	private String PP1_pri = "Private variable in public class";
	String PP1_def = "Default variable in public class";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program1_Public PP1 = new Program1_Public();
		System.out.println("Public Program 1");
		
		//Calling default class on same package
		Program1_Default PD1 = new Program1_Default();
		PD1.method1();
	}
	void method1(){
		System.out.println("default method in public class");
	}
	public void method2(){
		System.out.println("public method in public class inside firstPackage");
		System.out.println(PP1_pub);
		System.out.println(PP1_pro);
		System.out.println(PP1_pri);
		System.out.println(PP1_def);
	}

}
