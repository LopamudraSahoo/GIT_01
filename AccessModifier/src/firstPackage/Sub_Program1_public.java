package firstPackage;

public class Sub_Program1_public extends Program1_Public {

	public static void main(String[] args) {
		
		//Calling public class on same package
				Program1_Public PP1 = new Program1_Public();
				Sub_Program1_public PP2 = new Sub_Program1_public();
				
				PP1.method1();
				
				System.out.println(PP1.PP1_pub);
				System.out.println(PP1.PP1_pro);
				//System.out.println(PP1.PP1_pri);show error as this is private variable 
				System.out.println(PP1.PP1_def);
				
				System.out.println(PP2.PP1_pub);
				System.out.println(PP2.PP1_pro);
				//System.out.println(PP2.PP1_pri);show error as this is private variable
				System.out.println(PP2.PP1_def);
	}

}
