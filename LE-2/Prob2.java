/*
Ques 2: Test for Overriding
	Make a function with the same return type , name of the function, number and type of arguments in the Child class as they are 	in the Mother class.
	Change the string to be displayed on the screen. For example, if Mother class version of show ( ) was displaying “Hello World” 	then the child class version of 
	show ( ) will display “Hello JUET”. Run the application class and discuss the results obtained with your instructor.
*/

//mother.java

class mother 
{
    public void show()
    {
        System.out.println("I am mother”);
    }
}

//child.java

class child extends mother
{
    public void show()      // overriding show ( ) method of mother class
    {
        System.out.println("I am child");
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

I am mother
I am child
*/
