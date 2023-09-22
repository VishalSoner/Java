class Q11_subString2
{
	public static void main(String args[])
	{
		String s1 = "My Name is Vishal Soner";
		
		System.out.println( s1.substring(0, 4) );
		System.out.println( s1.substring(2, 4) );
		System.out.println( s1.substring(4, 4) );
		// System.out.println( s1.substring(2, 100) );
		
	}
}
/*
 
My N
 N
black
java.lang.StringIndexOutOfBoundsException
-------------------------------------------------------- 
*/


