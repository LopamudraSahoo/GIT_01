package secondPackage;
//Extending public class from different package.
import firstPackage.Program1_Public;

class Sub_Program1_Public_secondPkg extends Program1_Public{
	
	public static void main(String[] args) {
		
		Sub_Program1_Public_secondPkg A = new Sub_Program1_Public_secondPkg();
		
		 Program1_Public PP1 = new Program1_Public();
		//PP1.method1(); showed error as method1() has default access modifier
		 
	
		//Call public method from PP1 class in diff package.
		//Inside method2 Public,Private,Default,Protected variables are used
		PP1.method2();//This will print all the variables.
		
		//Call Public,Protected,Default & Private variable from other package
		System.out.println(PP1.PP1_pub);//Public variable worked fine
		//Protected,Default & Private showed visibility error
		
		//System.out.println(PP1.PP1_pro);
		//System.out.println(PP1.PP1_pri);
		//System.out.println(PP1.PP1_def);	
		A.method3();

	}
	void method3(){
		System.out.println(PP1_pro);
		//System.out.println(PP1.PP1_pro);
	}

}
