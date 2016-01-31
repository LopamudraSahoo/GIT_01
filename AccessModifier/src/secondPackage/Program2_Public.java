package secondPackage;

//Importing default class from other package
//import firstPackage.Program1_Default;//showed error as the access modifier is default and class is in different package
//Importing public class on different package
import firstPackage.Program1_Public;

public class Program2_Public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Program1_Public PP1 = new Program1_Public();
				//PP1.method1(); showed error as method1() has default access modifier
				
				/*Call public method method2() from PP1 class in diff package.
				Inside this method Public,Private,Default,Protected variables are used which it will print as its inside the class
				*/
				PP1.method2();//This will print all the variables because here we are only printing value inside Program1_Public class
				
				//Call Public,Protected,Default & Private variable from other package	
				System.out.println(PP1.PP1_pub);//Public variable worked fine
				/*Protected,Default & Private showed visibility error
				System.out.println(PP1.PP1_pro);
				System.out.println(PP1.PP1_pri);
				System.out.println(PP1.PP1_def);
				*/
				
		/*Calling default class on different package
				Program1_Default PD1 = new Program1_Default();
				PD1.method1();*/

	}

}
