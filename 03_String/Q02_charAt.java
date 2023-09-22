class Q02_charAt
{
	public static void main(String args[])
	{
		String s1 = "vishal Soner";
		
		System.out.println( s1.charAt(0) );
		System.out.println( s1.charAt(1) );
		System.out.println( s1.charAt(2) );
		System.out.println( s1.charAt(3) );
		System.out.println( s1.charAt(4) );
		System.out.println( s1.charAt(8) );
		
		
		System.out.println( s1.charAt(-2) );
		System.out.println( s1.charAt(15) );
		
	}
}
/*
 
v
i
s
h
a
o

java.lang.StringIndexOutOfBoundsException
java.lang.StringIndexOutOfBoundsException
-------------------------------------------------------- 
*/

