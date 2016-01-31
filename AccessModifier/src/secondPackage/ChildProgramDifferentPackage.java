package secondPackage;

import firstPackage.ParentProgram;

public class ChildProgramDifferentPackage extends ParentProgram{

	public static void main(String[] args) 
	{
		
		ChildProgramDifferentPackage CP = new ChildProgramDifferentPackage();
		ParentProgram PP = new ParentProgram();
		
		System.out.println(PP.Pub);//Public variable worked fine
		/*Protected showed visibility error
		System.out.println(PP.Pro); //Why Protected variable is showing visibility error ??Ans :- even though you have inherited , the object is another copy and inherited methods should be directly called as its own method.
		*/
		CP.method1();
	}
	
	public void method1()
	{
		System.out.println(Pro);//It is printing Protected variable.How the super class variable is accessed without object.
	}

}
