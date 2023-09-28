class Q35_Object_Class_equals
{
	public static void main(String args[])
	{
		String s1 = new String("Ram");
		String s2 = new String("Ram Ji");
		String s3 = new String("Ram");
		
		System.out.println( s1 == s2 );
		System.out.println( s1 == s3 );
		System.out.println( s2 == s3 );
		
		System.out.println( s1.equals(s2) );
		System.out.println( s2.equals(s3) );
		System.out.println( s1.equals(s3) );
		
	}
}


/*

false
false
false

false
false
true

String class ki .equals() method content compare ka kam karti he.
( == ) operator referance ko compare karta he.

--------------------------------------------------------------
*/






