/*Write a program in Java to print these patterns:

     *            * * * *
    * *            * * *
   * * *            * *
  * * * *            *
Hint: Use for loop in java, the syntax is same as that in C++.   */

public class LE1_Prob2a
{
	public static void main(String[] args){
	int rows = Integer.parseInt(args[0]);
	for ( int i = 1 ; i <=rows ; i++){
		for ( int j = rows ; j >= i ; j--)
		System.out.print(" ");

		for ( int k = 1 ; k <=i ; k++)
		System.out.print("* ");

		System.out.println();  	

	}
     }
}


//Pattern -2

public class LE1_Prob2b
{
	public static void main(String[] args) {
	   int rows = Integer.parseInt(args[0]);
	   for (int i = 1 ; i <= rows ; i++){
	       for ( int j = 1 ; j <= i ; j++)
	        System.out.print(" ");
	        
	        for ( int k = rows ; k >=i ; k-- )
	        System.out.print(" *");
	        
	        System.out.println();
	   }
	}
}
