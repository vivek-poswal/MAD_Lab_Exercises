/*
Ques 1. Test for Inheritance
      Make a class Mother with int x and void show ( ) as its members. Now create another
      class Child that is derived from the Mother class. Create another class Application to
      test the inheritance.
*/


//mother.java

class mother 
{
    int x=5;
    public void show()
    {
        System.out.print("Value of x : "+x);
    }
}

//child.java

class child extends mother
{
    public void display()
    {
        System.out.print("child");
    }
}

//Main.java

public class Main
{
    public static void main (String args[])
    {
        mother m= new mother ( );
        m.show( );    // show of Mother is called
        child ch=new child ( );
        ch. show ( );     // show ( ) inherited in Child from Mother is called
    }
}

/* OUTPUT

Value of x : 5
Value of x : 5
*/
