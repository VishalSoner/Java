import java.util.Scanner;
import java.io.IOException;

class Q21_Command_Line_Argument
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		String a1 = args[0];
		String a2 = args[1];
		String a3 = args[2];
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		
		System.out.println("Sum : " + (a1+a2+a3) );
		
		int b1 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(a2);
		int b3 = Integer.parseInt(a3);
		
		System.out.println("Sum : " + (b1+b2+b3) );
		
		
	}
}

/*	

javac Q21_Command_Line_Argument.java

Input :- 
java Q21_Command_Line_Argument 
Exception thread "main" java.lang.ArrayIndexOutOfBoundsException: 0




javac Q21_Command_Line_Argument.java

Input :- 
java Q21_Command_Line_Argument  10
Exception thread "main" java.lang.ArrayIndexOutOfBoundsException: 1





javac Q21_Command_Line_Argument.java

Input :- 
java Q21_Command_Line_Argument  10 20 
Exception thread "main" java.lang.ArrayIndexOutOfBoundsException: 2





javac Q21_Command_Line_Argument.java

Input :- 
java Q21_Command_Line_Argument  10 20 30
a1 : 10
a2 : 20
a3 : 30
Sum : 102030
Sum : 60



--------------------------------------------------------------------------------------------------------------------------	*/





