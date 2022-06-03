/*
2. Interfaces to be implemented by first non-abstract class
Make an interface ‘Testable’ that contains a method declaration for display ( ).
a) Create a class ‘Test’ that implements Testable. Compile this class, and write your
observations.
b) Create another abstract class ‘AbsTest’ implements Testable. Compile this class,
and write your observations.
*/

//AbsTest.java 

abstract class AbsTest implements TestTable{

}

//Main.java

public class Main
{
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
}

//Test.java

class Test implements TestTable{
    public void display(){
        System.out.println("In class Test");
    }
}

//testTable.java

interface TestTable{
    void display();
}
