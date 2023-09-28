class Q36_Object_Class_equals
{
	public static void main(String args[])
	{
		StringBuffer s1 = new StringBuffer("Ram");
		StringBuffer s2 = new StringBuffer("Ram Ji");
		StringBuffer s3 = new StringBuffer("Ram");
		
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
false



StringBuffer class ki .equals() method nai he that's by 
Object class li equals or ( == ) operator referance ko compare karta he.
--------------------------------------------------------------
*/






