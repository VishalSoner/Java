import static java.lang.System.*;
import static java.lang.Integer.*;

class Q19_Static_Import
{
	public static void main(String args[])
	{
		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		out.println("Sum : " + (x1+y1) );

		int x2 = parseInt(args[0]);
		int y2 = parseInt(args[1]);
		out.println("Sum : " + (x2+y2) );
		
		out.println(Integer.MAX_VALUE);
		out.println(MAX_VALUE);
	}
}
 
/* 
Output :-

Sum : 30
Sum : 30
2147483647
2147483647

------------------------------------------------
*/




