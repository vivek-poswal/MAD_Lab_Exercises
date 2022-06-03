/*
Write a program in Java to print the table of a number received through command
line argument, e.g:-

If user gives 4 through command line argument, the program should print:
    4 x 1= 4
    4 x 2= 8
    ............
    4x10= 40
*/

public class LE1_Prob4
{
	public static void main(String[] args){
	    int  x = 4;
	    for ( int i = 1 ; i <=10 ; i++){
		System.out.println(x +" * " + i + " = " + (x*i));  	

	}
     }
}
