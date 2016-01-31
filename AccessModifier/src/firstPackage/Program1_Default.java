package firstPackage;

// In this class we are checking how public,private,default,protected variables,methods behave when these are called from different class within same package.
class Program1_Default {
	public String PD1_pub = "Public variable in default class";
	String PD1_def = "Default variable in default class";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program1_Default PD1 = new Program1_Default();
		System.out.println("Default Program 1");
		
		//Calling public class on same package
		Program1_Public PP1 = new Program1_Public();
		PP1.method1();//calling default method from Program1_Public class but in same package
		System.out.println(PP1.PP1_pub);
		System.out.println(PP1.PP1_pro);
		//System.out.println(PP1.PP1_pri);show error as this is private variable 
		System.out.println(PP1.PP1_def);
	}
	void method1(){
		System.out.println("Default class 1");
		System.out.println(PD1_pub);
		System.out.println(PD1_def);
	}

}
