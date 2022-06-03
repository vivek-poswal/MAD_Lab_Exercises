/*
Ques 3: Test for Polymorphism
Write another statement in Application class: Mother m1=new Child ( ); Now, call show () with reference variable m1 and ‘.’ (dot) operator. 
Discuss the result with your instructor. Now, make the method show ( ) static in Mother only and check the results after executing Application. 
Repeat this by making show () static in Child only. Observe the errors. Test whether the static methods are inheritable or not. Now make show () static in both 
Mother as well as in Child and discuss the results with your instructor. Make a table to summarize your results.
*/

// ******** Main.java  ************
 		
		// in case both show functions of mother and child are not static runtime polymorphism(dynamic binding) will be followed
		// i.e. show function of the type of object will be shown
		
		// in case both show functions of mother and child are static compile time polymorphism(static binding) will be followed
		// i.e. show function of the type of reference variable will be shown
		
		// in case only one of the c;ass is static program will show an error and overriding won't be possible

public class Main
{
	public static void main(String[] args) {
		Mother m1 = new Child();
		m1.show();
	}
}


//mother.java

class Mother
{
    public static void show(){
        System.out.println("Hello World");
    }
}

//child.java

class Mother
{
    public static void show(){
        System.out.println("Hello World");
    }
}
